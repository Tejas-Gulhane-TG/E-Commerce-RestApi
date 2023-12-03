package com.example.ECommerceRestApi.DTO.ResponseDto;

import com.example.ECommerceRestApi.Enum.ProductType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderResponseDto {


    int orderId;

    int productId;

    int quantity;

    String productName;

    double price;

    ProductType productType;

    String UserName;

    String Massage;

}
