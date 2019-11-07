package com.bbsmax.controller;

import com.bbsmax.model.Account;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {

    /*@PostMapping("/postParameter")
    public SearchParam postParameter(@RequestBody SearchParam searchParam){
        System.out.println(searchParam.getEmail());
        return searchParam;
    }*/

    @PostMapping("/postParameter")
    public String postParameter(@RequestBody Account account){
        //String email = account.getEmail();
        return "account";
    }

    /*@PostMapping("/userParameter")
    public User userParameter(@RequestBody User user){
        //System.out.println(user.getAccount());
        //System.out.println(user.getEmail());
        return user;
    }*/
}
