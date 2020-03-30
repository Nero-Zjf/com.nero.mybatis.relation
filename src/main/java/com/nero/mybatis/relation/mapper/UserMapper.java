package com.nero.mybatis.relation.mapper;

import com.nero.mybatis.relation.domain.pojo.UserIdcard;
import com.nero.mybatis.relation.domain.pojo.UserIdcard2;
import com.nero.mybatis.relation.domain.pojo.UserOrder;

import java.util.List;

public interface UserMapper {
    List<UserIdcard> getAllUserWithIdcard();
    List<UserIdcard> getAllUserWithIdcard2();
    List<UserIdcard2> getAllUserWithIdcard3();

    List<UserOrder> getAllUserWithOrder();
    List<UserOrder> getAllUserWithOrder2();
}
