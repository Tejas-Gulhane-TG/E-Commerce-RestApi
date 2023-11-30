package com.example.ECommerceRestApi.Service;

import com.example.ECommerceRestApi.DTO.RequestDto.UserRequestDTO;
import com.example.ECommerceRestApi.DTO.ResponseDto.UserResponseDTO;
import com.example.ECommerceRestApi.Model.User;

public interface UserService {

    UserResponseDTO AddUser(UserRequestDTO userRequestDTO);
}
