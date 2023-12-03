package com.example.ECommerceRestApi.Service.Impl;

import com.example.ECommerceRestApi.DTO.RequestDto.ProductBySeller;
import com.example.ECommerceRestApi.DTO.RequestDto.ProductRequestDTO;
import com.example.ECommerceRestApi.DTO.ResponseDto.ProductResponseDTO;
import com.example.ECommerceRestApi.Model.Product;
import com.example.ECommerceRestApi.Repository.ProductRepository;
import com.example.ECommerceRestApi.Service.ProductService;
import com.example.ECommerceRestApi.Transformer.ProductTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;
    @Override
    public ProductResponseDTO AddProduct(ProductRequestDTO productRequestDTO) {

        Product product = ProductTransformer.DtoToProduct(productRequestDTO);
        productRepository.save(product);
        ProductResponseDTO productResponseDTO = ProductTransformer.ProductToDto(product);
        return productResponseDTO;
    }

    @Override
    public List<Product> GetProductBySeller(ProductBySeller productBySeller) {

        List<Product> productList = new ArrayList<>();
        productList.add(productRepository.findByMobileNo(productBySeller.getMobileNo()));
        if(productList.isEmpty()){
            return null;
        }
        for(int i=0; i<productList.size(); i++){
            Product product = productList.get(i);
            if(product.getProductType() != productBySeller.getProductType()){
                productList.remove(i);
            }
        }
        return productList;
    }
}
