package com.example.ECommerceRestApi.Model;

import com.example.ECommerceRestApi.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    String address;

    @Column(unique = true)
    long mobileNo;

    int age;

    @Enumerated(EnumType.STRING)
    Gender gender;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL )
    List<Orders> orderList = new ArrayList<>();

}
