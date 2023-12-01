package com.example.ECommerceRestApi.Service;

import com.example.ECommerceRestApi.DTO.RequestDto.ProductRequestDTO;
import com.example.ECommerceRestApi.DTO.ResponseDto.ProductResponseDTO;

public interface ProductService {
    ProductResponseDTO AddProduct(ProductRequestDTO productRequestDTO);
}
