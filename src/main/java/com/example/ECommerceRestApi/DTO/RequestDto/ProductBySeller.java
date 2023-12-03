package com.example.ECommerceRestApi.DTO.RequestDto;

import com.example.ECommerceRestApi.Enum.ProductType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductBySeller {

    ProductType productType;

    long mobileNo;
}
