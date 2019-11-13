package com.market.shoppingmall.repository;

import com.market.shoppingmall.ShoppingmallApplicationTests;
import com.market.shoppingmall.model.entity.Item;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class ItemRepositoryTests extends ShoppingmallApplicationTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create() {
        String name = "삼성노트북";
        String titie = "삼성노트북 A100";
        String content = "2019년 삼성노트북 입니다. ";
        Integer price = 900000;
        String status = "REGISTERED";
        String brandName = "삼성";
        LocalDateTime registeredAt = LocalDateTime.now();
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "Admin";
        Long partnerId = 1L;

        Item item = new Item();
        item.setName(name);
        item.setTitle(titie);
        item.setContent(content);
        item.setPrice(price);
        item.setStatus(status);
        item.setBrandName(brandName);
        item.setCreatedAt(createdAt);
        item.setCreatedAt(createdAt);
        item.setRegisteredAt(registeredAt);
        item.setPartnerId(partnerId);
        item.setCreatedBy(createdBy);

        Item newItem = itemRepository.save(item);
        Assert.assertNotNull(newItem);
        Assert.assertEquals(newItem.getName(), name);
    }
}
