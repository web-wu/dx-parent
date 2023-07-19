package com.tabwu.transactional;

import com.tabwu.transactional.entity.Order;
import com.tabwu.transactional.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2023/7/17 15:03
 * @DESCRIPTION:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void addOrderTest() {
        Order order = new Order();
        order.setId(1);
        order.setUsername("tabwu");
        order.setAge(27);
        orderService.addOrder(order);
    }
}
