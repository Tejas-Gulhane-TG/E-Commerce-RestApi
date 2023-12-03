package com.example.ECommerceRestApi.Service.Impl;

import com.example.ECommerceRestApi.DTO.RequestDto.OrderRequestDto;
import com.example.ECommerceRestApi.DTO.ResponseDto.OrderResponseDto;
import com.example.ECommerceRestApi.Model.Orders;
import com.example.ECommerceRestApi.Model.Product;
import com.example.ECommerceRestApi.Model.User;
import com.example.ECommerceRestApi.Repository.OrderRepository;
import com.example.ECommerceRestApi.Repository.ProductRepository;
import com.example.ECommerceRestApi.Repository.UserRepository;
import com.example.ECommerceRestApi.Service.OrderService;
import com.example.ECommerceRestApi.Transformer.OrderTransformer;
import com.example.ECommerceRestApi.UUID.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public OrderResponseDto PlaceOrder(OrderRequestDto orderRequestDto) {
        Product product = productRepository.findById(orderRequestDto.getProductId());
        User user = userRepository.findByMobileNo(orderRequestDto.getUserMoNo());

        if(user == null){
            OrderResponseDto orderResponseDto= new OrderResponseDto();
            orderResponseDto.setMassage("User Not Found Wrong Mobile No");
            return orderResponseDto;
        }
        if(product.getQuantity() <= 0 || orderRequestDto.getQuantity() > product.getQuantity()){
            OrderResponseDto orderResponseDto= new OrderResponseDto();
            orderResponseDto.setMassage("Product Out Of Stock");
            return orderResponseDto;
        }
        if(orderRequestDto.getProductType() != product.getProductType()){
            OrderResponseDto orderResponseDto= new OrderResponseDto();
            orderResponseDto.setMassage("Product_Type & Product_ID not match");
            return orderResponseDto;
        }

        int quantity = product.getQuantity();
        double price = orderRequestDto.getQuantity() * product.getPrice();
        quantity = quantity - orderRequestDto.getQuantity();
        product.setQuantity(quantity);
        productRepository.save(product);

        Orders orders = OrderTransformer.RequestDtoToOrder(orderRequestDto);
        orders.setUser(user);
        orders.setOrderId(UUID.uid());
        orders.setPrice(price);
        orders.setProductName(product.getName());
        orderRepository.save(orders);
        OrderResponseDto orderResponseDto = OrderTransformer.OrderToResponse(orders);
        orderResponseDto.setUserName(user.getName());
        return orderResponseDto;
    }
}
