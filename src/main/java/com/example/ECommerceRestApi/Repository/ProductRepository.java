package com.example.ECommerceRestApi.Repository;

import com.example.ECommerceRestApi.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findById(int id);

    Product findByMobileNo(long mobileNo);

//    @Query( "select  * from product where product_type like ELECTRONICS && mobile_no like 9552776482")
//    Collection<Product> ProductBySeller();



}
