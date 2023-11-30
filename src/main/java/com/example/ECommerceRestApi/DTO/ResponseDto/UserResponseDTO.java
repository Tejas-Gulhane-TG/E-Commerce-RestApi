package com.example.ECommerceRestApi.DTO.ResponseDto;

import com.example.ECommerceRestApi.Enum.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponseDTO {

    String name;

    String address;

    long mobileNo;

    int age;

    Gender gender;

}
