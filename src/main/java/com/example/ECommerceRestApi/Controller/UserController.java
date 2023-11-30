package com.example.ECommerceRestApi.Controller;

import com.example.ECommerceRestApi.DTO.RequestDto.UserRequestDTO;
import com.example.ECommerceRestApi.DTO.ResponseDto.UserResponseDTO;
import com.example.ECommerceRestApi.Model.User;
import com.example.ECommerceRestApi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public UserResponseDTO AddUser(@RequestBody UserRequestDTO userRequestDTO ){
        UserResponseDTO userResponseDTO = userService.AddUser(userRequestDTO);
        return userResponseDTO;
    }
}
