package com.market.shoppingmall.controller.api;

import com.market.shoppingmall.ifs.CrudInterface;
import com.market.shoppingmall.model.network.Header;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController implements CrudInterface {

    @Override
    @PostMapping("")
    public Header create() {
        return null;
    }

    @Override
    @GetMapping("{id}") //api/user/{id}
    public Header read(@PathVariable(name="id") Long id) {
        return null;
    }

    @Override
    @PutMapping("") //api/user
    public Header update() {
        return null;
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(@PathVariable Long id) {
        return null;
    }

}
