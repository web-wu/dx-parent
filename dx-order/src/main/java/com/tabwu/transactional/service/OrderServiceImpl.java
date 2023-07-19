package com.tabwu.transactional.service;

import com.tabwu.transactional.entity.Order;
import com.tabwu.transactional.feign.StorageFeign;
import com.tabwu.transactional.mapper.OrderMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2023/7/17 15:00
 * @DESCRIPTION:
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private StorageFeign storageFeign;

    @Override
//    @Transactional
    @GlobalTransactional
    public void addOrder(Order order) {
        orderMapper.addOrder(order);

        storageFeign.updateStroageNum(1);

        int i = 10 / 0;
    }
}
