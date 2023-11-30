package com.example.ECommerceRestApi.Transformer;

import com.example.ECommerceRestApi.DTO.RequestDto.UserRequestDTO;
import com.example.ECommerceRestApi.DTO.ResponseDto.UserResponseDTO;
import com.example.ECommerceRestApi.Model.User;

public class UserTransformer {

    public static User RequestToUser(UserRequestDTO userRequestDTO){
        User user = new User();
        user.setAddress(userRequestDTO.getAddress());
        user.setName(userRequestDTO.getName());
        user.setAge(userRequestDTO.getAge());
        user.setGender(userRequestDTO.getGender());
        user.setMobileNo(userRequestDTO.getMobileNo());

        return user;
    }

    public static UserResponseDTO UserToResponse(User user){
        return UserResponseDTO.builder()
                .address(user.getAddress())
                .name(user.getName())
                .gender(user.getGender())
                .mobileNo(user.getMobileNo())
                .age(user.getAge())
                .build();
    }
}
