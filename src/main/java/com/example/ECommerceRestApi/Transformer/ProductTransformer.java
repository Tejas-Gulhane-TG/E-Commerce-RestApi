package com.example.ECommerceRestApi.Transformer;

import com.example.ECommerceRestApi.DTO.RequestDto.ProductRequestDTO;
import com.example.ECommerceRestApi.DTO.ResponseDto.ProductResponseDTO;
import com.example.ECommerceRestApi.Model.Product;

public class ProductTransformer {

    public static Product DtoToProduct(ProductRequestDTO productRequestDTO){

        return Product.builder()
                .productType(productRequestDTO.getProductType())
                .price(productRequestDTO.getPrice())
                .name(productRequestDTO.getName())
                .quantity(productRequestDTO.getQuantity())
                .mobileNo(productRequestDTO.getMobileNo())
                .sellerName(productRequestDTO.getSellerName())
                .build();
    }

    public static ProductResponseDTO ProductToDto(Product product){
        return ProductResponseDTO.builder()
                .productType(product.getProductType())
                .name(product.getName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .sellerName(product.getSellerName())
                .mobileNo(product.getMobileNo())
                .build();
    }
}
