package com.example.ECommerceRestApi.DTO.ResponseDto;

import com.example.ECommerceRestApi.Enum.ProductType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductResponseDTO {

    String name;

    String sellerName;

    int quantity;

    double price;

    ProductType productType;
}