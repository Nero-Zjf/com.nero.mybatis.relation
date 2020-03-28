package com.nero.mybatis.relation.mapper;

import com.nero.mybatis.relation.domain.po.UserPO;
import com.nero.mybatis.relation.domain.pojo.User;
import com.nero.mybatis.relation.domain.pojo.User2;

import java.util.List;

public interface UserMapper {
    List<User> getAllUser();
    List<User> getAllUser2();
    List<User2> getAllUser3();
}
