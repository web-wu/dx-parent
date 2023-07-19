package com.tabwu.transactional.storage;

import com.tabwu.transactional.storage.service.StorageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2023/7/17 16:02
 * @DESCRIPTION:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StorageTest {

    @Resource
    private StorageService storageService;

    @Test
    public void updateStorageNum() {
        storageService.updateStorageNum(1);
    }
}
