package com.example.demo.repository;

import com.example.demo.DemoApplicationTests;
import com.example.demo.model.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends DemoApplicationTests {

    @Autowired
    private UserRepository userRepository; //싱글톤

    @Test
    public void create() {
        User user = new User();
        user.setAccount("test");
        user.setEmail("test@nate.com");
        user.setPhoneNumber("010-1234-2211");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("test");
        User newUser = userRepository.save(user);
        System.out.println("new user : " + newUser);
    }

    @Test
    public void read() {
        Optional<User> user = userRepository.findById(1L);

        user.ifPresent(item -> {
            System.out.println("user : " + user);
        });
    }

    @Test
    public void updated() {
        Optional<User> user = userRepository.findById(1L);
        user.ifPresent(item -> {
            item.setAccount("test001");
            item.setEmail("test00@nate.com");
            item.setPhoneNumber("010-1234-5678");
            item.setUpdatedAt(LocalDateTime.now());
            item.setUpdatedBy("admin");
            userRepository.save(item);
        });

        System.out.println("new user : " + user);
    }

    @Test
    @Transactional
    public void delete() {
        Optional<User> user = userRepository.findById(1L);

        Assert.assertTrue(user.isPresent());

        user.ifPresent(item -> {
            userRepository.delete(item);
        });

        Optional<User> deluser = userRepository.findById(1L);

        Assert.assertFalse(deluser.isPresent());
    }
}
