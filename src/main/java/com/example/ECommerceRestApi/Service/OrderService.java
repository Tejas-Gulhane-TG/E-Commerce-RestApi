package com.example.ECommerceRestApi.Service;

import com.example.ECommerceRestApi.DTO.RequestDto.OrderRequestDto;
import com.example.ECommerceRestApi.DTO.ResponseDto.OrderResponseDto;

public interface OrderService {
    OrderResponseDto PlaceOrder(OrderRequestDto orderRequestDto);
}
