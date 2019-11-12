package com.market.shoppingmall.repository;

import com.market.shoppingmall.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findByType(String type);
}
