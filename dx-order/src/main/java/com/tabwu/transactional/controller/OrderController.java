package com.tabwu.transactional.controller;

import com.tabwu.transactional.entity.Order;
import com.tabwu.transactional.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2023/7/17 16:52
 * @DESCRIPTION:
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/add")
    public void addOrderTest() {
        Order order = new Order();
        order.setId(1);
        order.setUsername("tabwu");
        order.setAge(27);
        orderService.addOrder(order);
    }
}
