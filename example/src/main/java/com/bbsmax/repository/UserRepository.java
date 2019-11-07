package com.bbsmax.repository;

import com.bbsmax.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repository로 작성을 하면 따로 쿼리를 작성하지 않아도 된다.
//Create, Read, Update, Delete가 가능하다.

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //jpaRepository 에서 설정할 타입 User이고, Primary Key 값(id)가 Long형이므로 Long으로 설정함.
}
