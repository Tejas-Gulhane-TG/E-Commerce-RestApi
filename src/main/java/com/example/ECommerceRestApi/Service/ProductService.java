package com.example.ECommerceRestApi.Service;

import com.example.ECommerceRestApi.DTO.RequestDto.ProductBySeller;
import com.example.ECommerceRestApi.DTO.RequestDto.ProductRequestDTO;
import com.example.ECommerceRestApi.DTO.ResponseDto.ProductResponseDTO;
import com.example.ECommerceRestApi.Model.Product;

import java.util.List;

public interface ProductService {
    ProductResponseDTO AddProduct(ProductRequestDTO productRequestDTO);

    List<Product> GetProductBySeller(ProductBySeller productBySeller);
}
