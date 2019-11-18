package com.market.shoppingmall.repository;

import com.market.shoppingmall.ShoppingmallApplicationTests;
import com.market.shoppingmall.model.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTests extends ShoppingmallApplicationTests {

    @Autowired
    private UserRepostiory userRepostiory;

    @Test
    public void create() {
        String account = "test1";
        String password = "test1";
        String email = "test@gmail.com";
        String phoneNumber = "010-1111-2222";
        String status = "REGISTERED";
        LocalDateTime registeredAt = LocalDateTime.now();
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "Admin";

        User user = new User();

        //Lombok 생성자 디자인패턴
        User u = User.builder().account(account).password(password).status(status).build();
        //@Accessors(chain = true)을 User에 설정 -> user.setEmail("test").setPhoneNumber("001--1---");

        user.setAccount(account);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setStatus(status);
        user.setRegisteredAt(registeredAt);
//        user.setCreatedAt(createdAt);
//        user.setCreatedBy(createdBy);

        User newUser = userRepostiory.save(user);

        Assert.assertNotNull(newUser);

     }

    @Test
    @Transactional
    public void read() {

        //Optional<User> user = userRepostiory.findById(1L);
        String phoneNumber = "010-1111-2222";
        User user = userRepostiory.findFirstByPhoneNumberOrderByIdDesc(phoneNumber);

        if(user != null){
            user.getOrderGroupList().stream().forEach(orderGroup -> {
                System.out.println("-------------- 장바구니 --------------------");
                System.out.println("수령인 : "+orderGroup.getRecvName());
                System.out.println("주소 : "+orderGroup.getRecvAddress());
                System.out.println("총액 : "+orderGroup.getTotalPrice());
                System.out.println("수량 : "+orderGroup.getTotalQuantity());

                System.out.println("-------------- 상세내용 --------------------");
                orderGroup.getOrderDetailList().stream().forEach(orderDetail -> {
                    System.out.println("주문상품 : " + orderDetail.getItem().getName());
                    System.out.println("제조사 : " + orderDetail.getItem().getPartner().getName());
                    System.out.println("제조사 카테고리 : "+ orderDetail.getItem().getPartner().getCategory().getTitle());
                    System.out.println("고객센터 : " + orderDetail.getItem().getPartner().getCallCenter());
                    System.out.println("주문상태 : " + orderDetail.getStatus());
                    System.out.println("도착예정일 : " + orderDetail.getArrivalDate());

                });
            });
        }

        Assert.assertNotNull(user);
       /*user.ifPresent(item -> {
           System.out.println("user : " + user);
       });*/
    }
}
