package com.tabwu.transactional.storage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2023/7/17 15:55
 * @DESCRIPTION:
 */
@TableName("storage")
@Data
public class Storage implements Serializable {

    private int id;

    private String product;

    private int num;
}
