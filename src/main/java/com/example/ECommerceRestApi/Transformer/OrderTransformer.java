package com.example.ECommerceRestApi.Transformer;

import com.example.ECommerceRestApi.DTO.RequestDto.OrderRequestDto;
import com.example.ECommerceRestApi.DTO.ResponseDto.OrderResponseDto;
import com.example.ECommerceRestApi.Model.Orders;

public class OrderTransformer {

    public static Orders RequestDtoToOrder(OrderRequestDto orderRequestDto){
        return Orders.builder()
                .productId(orderRequestDto.getProductId())
                .productType(orderRequestDto.getProductType())
                .quantity(orderRequestDto.getQuantity())
                .build();
    }

    public static OrderResponseDto OrderToResponse(Orders orders){
        return OrderResponseDto.builder()
                .orderId(orders.getOrderId())
                .productId(orders.getProductId())
                .price(orders.getPrice())
                .productName(orders.getProductName())
                .productType(orders.getProductType())
                .Massage("Order Successfully")
                .quantity(orders.getQuantity())
                .build();
    }
}
