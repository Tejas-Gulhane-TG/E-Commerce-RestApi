package com.example.ECommerceRestApi.Controller;

import com.example.ECommerceRestApi.DTO.RequestDto.ProductBySeller;
import com.example.ECommerceRestApi.DTO.RequestDto.ProductRequestDTO;
import com.example.ECommerceRestApi.DTO.ResponseDto.ProductResponseDTO;
import com.example.ECommerceRestApi.Model.Product;
import com.example.ECommerceRestApi.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public ProductResponseDTO AddProduct(@RequestBody ProductRequestDTO productRequestDTO  ){
        ProductResponseDTO productResponseDTO = productService.AddProduct(productRequestDTO);
        return productResponseDTO;
    }

    @GetMapping("/getByTypeAndSeller")
    public List<Product> GetProduct(@RequestBody ProductBySeller productBySeller){
        List<Product> productList = new ArrayList<>();
        productList = productService.GetProductBySeller(productBySeller);
        return productList;
    }
}
