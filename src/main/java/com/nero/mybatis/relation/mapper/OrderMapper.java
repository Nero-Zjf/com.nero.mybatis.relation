package com.nero.mybatis.relation.mapper;

import com.nero.mybatis.relation.domain.po.OrderPO;

import java.util.List;

public interface OrderMapper {
    List<OrderPO> getOrderListByUserId(Long userId);
}