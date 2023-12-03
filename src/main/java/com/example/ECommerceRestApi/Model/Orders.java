package com.example.ECommerceRestApi.Model;

import com.example.ECommerceRestApi.Enum.ProductType;
import com.example.ECommerceRestApi.UUID.UUID;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(unique = true)
    int orderId;

    @Column(nullable = false)
    int productId;

    String productName;

    double price;

    int quantity;

    @Enumerated(EnumType.STRING)
    ProductType productType;

    @ManyToOne
    @JoinColumn(referencedColumnName = "mobileNo")
    User user;


}
