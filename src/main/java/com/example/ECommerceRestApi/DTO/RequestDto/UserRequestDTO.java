package com.example.ECommerceRestApi.DTO.RequestDto;

import com.example.ECommerceRestApi.Enum.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequestDTO {

    String name;

    String address;

    long mobileNo;

    int age;

    Gender gender;

}
