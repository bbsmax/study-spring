package com.market.shoppingmall.repository;

import com.market.shoppingmall.ShoppingmallApplicationTests;
import com.market.shoppingmall.model.entity.Category;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

public class CategoryRepositoryTest extends ShoppingmallApplicationTests {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void create(){
        String type = "COMPUTER";
        String title = "컴퓨터";
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "AdminServer";

        Category category = new Category();
        category.setType(type);
        category.setTitle(title);
        category.setCreatedAt(createdAt);
        category.setCreatedBy(createdBy);

        Category newCategory = categoryRepository.save(category);

        Assert.assertNotNull(newCategory);
        Assert.assertEquals(newCategory.getType(), type);
        Assert.assertEquals(newCategory.getTitle(), title);

    }

    @Test
    public void read(){

        //Optional<Category> category = categoryRepository.findById(1L);

        String type = "COMPUTER";
        Optional<Category> category = categoryRepository.findByType(type);
        category.ifPresent( item -> {
            Assert.assertEquals(item.getType(), type);
            System.out.println("item : " + item.getId());
            System.out.println("item : " + item.getType());
            System.out.println("item : " + item.getTitle());
        });
    }
}
