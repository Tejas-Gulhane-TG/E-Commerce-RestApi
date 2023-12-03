package com.example.ECommerceRestApi.Controller;

import com.example.ECommerceRestApi.DTO.RequestDto.OrderRequestDto;
import com.example.ECommerceRestApi.DTO.ResponseDto.OrderResponseDto;
import com.example.ECommerceRestApi.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/place")
    public OrderResponseDto PlaceOrder(@RequestBody OrderRequestDto orderRequestDto){
        OrderResponseDto orderResponseDto = orderService.PlaceOrder(orderRequestDto);
        return orderResponseDto;
    }

}
