package com.bbsmax.repository;

import com.bbsmax.ApplicationTests;
import com.bbsmax.model.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends ApplicationTests {

    @Autowired
    private UserRepository userRepository;
    //싱글톤 - 한개를 생성한 후 이걸로 계속해서 사용하겠다는 내용

    @Test
    public void create(){
        User user = new User();
        user.setAccount("TestUser03");
        user.setEmail("TestUser03@nate.com");
        user.setPhoneNumber("010-1242-2564");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");

        User newUser = userRepository.save(user);

        System.out.println("newUser : " + newUser);
    }

    public void read(){

    }

    public void update(){

    }

    public void delete(){

    }

}
