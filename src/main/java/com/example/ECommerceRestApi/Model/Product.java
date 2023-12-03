package com.example.ECommerceRestApi.Model;

import com.example.ECommerceRestApi.Enum.ProductType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    String sellerName;

    @Column(nullable = false)
    long mobileNo;

    int quantity;

    double price;

    @Enumerated(EnumType.STRING)
    ProductType productType;



}
