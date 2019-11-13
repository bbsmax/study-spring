package com.market.shoppingmall.repository;

import com.market.shoppingmall.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepostiory extends JpaRepository<User, Long> {
    User findFirstByPhoneNumberOrderByIdDesc(String phoneNumber);
}
