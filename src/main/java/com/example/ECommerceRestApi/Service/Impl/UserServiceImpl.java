package com.example.ECommerceRestApi.Service.Impl;

import com.example.ECommerceRestApi.DTO.RequestDto.UserRequestDTO;
import com.example.ECommerceRestApi.DTO.ResponseDto.UserResponseDTO;
import com.example.ECommerceRestApi.Model.User;
import com.example.ECommerceRestApi.Repository.UserRepository;
import com.example.ECommerceRestApi.Service.UserService;
import com.example.ECommerceRestApi.Transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserResponseDTO AddUser(UserRequestDTO userRequestDTO) {
        User user = UserTransformer.RequestToUser(userRequestDTO);
        userRepository.save(user);
        UserResponseDTO userResponseDTO = UserTransformer.UserToResponse(user);
        return userResponseDTO;
    }
}
