package com.market.shoppingmall.repository;

import com.market.shoppingmall.ShoppingmallApplicationTests;
import com.market.shoppingmall.model.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTests extends ShoppingmallApplicationTests {

    @Autowired
    private UserRepostiory userRepostiory;

    @Test
    public void create() {
        String account = "test";
        String password = "test";
        String email = "test@gmail.com";
        String phoneNumber = "010-1111-2222";
        String status = "REGISTERED";
        LocalDateTime registeredAt = LocalDateTime.now();
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "Admin";

        User user = new User();
        user.setAccount(account);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setStatus(status);
        user.setRegisteredAt(registeredAt);
        user.setCreatedAt(createdAt);
        user.setCreatedBy(createdBy);

        User newUser = userRepostiory.save(user);

        Assert.assertNotNull(newUser);

     }

    @Test
    public void read() {

        //Optional<User> user = userRepostiory.findById(1L);
        String phoneNumber = "010-1111-2222";
        User user = userRepostiory.findFirstByPhoneNumberOrderByIdDesc(phoneNumber);
        Assert.assertNotNull(user);
       /*user.ifPresent(item -> {
           System.out.println("user : " + user);
       });*/
    }
}
