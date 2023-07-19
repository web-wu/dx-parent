package com.tabwu.transactional.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2023/7/17 14:55
 * @DESCRIPTION:
 */
@TableName("order")
@Data
public class Order implements Serializable {

    private int id;

    private String username;

    private int age;
}
