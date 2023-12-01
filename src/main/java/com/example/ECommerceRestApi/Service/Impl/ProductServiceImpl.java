package com.example.ECommerceRestApi.Service.Impl;

import com.example.ECommerceRestApi.DTO.RequestDto.ProductRequestDTO;
import com.example.ECommerceRestApi.DTO.ResponseDto.ProductResponseDTO;
import com.example.ECommerceRestApi.Model.Product;
import com.example.ECommerceRestApi.Repository.ProductRepository;
import com.example.ECommerceRestApi.Service.ProductService;
import com.example.ECommerceRestApi.Transformer.ProductTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;
    @Override
    public ProductResponseDTO AddProduct(ProductRequestDTO productRequestDTO) {

        Product product = ProductTransformer.DtoToProduct(productRequestDTO);
        productRepository.save(product);
        ProductResponseDTO productResponseDTO = ProductTransformer.ProductToDto(product);
        return productResponseDTO;
    }
}
