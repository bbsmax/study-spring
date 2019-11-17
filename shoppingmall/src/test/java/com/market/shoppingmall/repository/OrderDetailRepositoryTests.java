package com.market.shoppingmall.repository;

import com.market.shoppingmall.ShoppingmallApplicationTests;
import com.market.shoppingmall.model.entity.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderDetailRepositoryTests extends ShoppingmallApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create(){
        OrderDetail orderDetail = new OrderDetail();

        String status = "WAITING";
        LocalDateTime arrival_date = LocalDateTime.now().plusDays(2);
        Integer quantity = 1;
        BigDecimal totalPrice = BigDecimal.valueOf(900000);
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "AdminUser";
        Long itemId = 1L;
        Long orderGroupId = 1L;

        orderDetail.setStatus(status);
        orderDetail.setArrivalDate(arrival_date);
        orderDetail.setQuantity(quantity);
        orderDetail.setTotalPrice(totalPrice);
        orderDetail.setCreatedAt(createdAt);
        orderDetail.setCreatedBy(createdBy);
        orderDetail.setItemId(itemId);
        orderDetail.setOrderGroupId(orderGroupId);

        OrderDetail newOderDetail = orderDetailRepository.save(orderDetail);

        Assert.assertNotNull(newOderDetail);
        Assert.assertEquals(newOderDetail.getArrivalDate(), arrival_date);
    }
}
