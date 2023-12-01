package com.example.ECommerceRestApi.Model;

import com.example.ECommerceRestApi.Enum.ProductType;
import com.example.ECommerceRestApi.UUID.UUID;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    int orderId = UUID.uid();

    String productName;

    double price;

    @Enumerated(EnumType.STRING)
    ProductType productType;

    @ManyToOne
    @JoinColumn(referencedColumnName = "mobileNo")
    User user;


}
