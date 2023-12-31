package com.example.ECommerceRestApi.Repository;

import com.example.ECommerceRestApi.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>  {

    User findByMobileNo(long mobileNo);

}
