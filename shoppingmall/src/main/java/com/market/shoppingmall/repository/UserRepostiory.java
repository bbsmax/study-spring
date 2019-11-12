package com.market.shoppingmall.repository;

import com.market.shoppingmall.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepostiory extends JpaRepository<User, Long> {
}
