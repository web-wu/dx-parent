package com.tabwu.transactional.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tabwu.transactional.entity.Order;
import org.apache.ibatis.annotations.Insert;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2023/7/17 14:57
 * @DESCRIPTION:
 */
public interface OrderMapper extends BaseMapper<Order> {

    @Insert("insert into `order` values(#{id}, #{username}, #{age});")
    int addOrder(Order order);
}
