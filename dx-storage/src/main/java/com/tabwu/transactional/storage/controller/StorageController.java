package com.tabwu.transactional.storage.controller;

import com.tabwu.transactional.storage.service.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2023/7/17 16:28
 * @DESCRIPTION:
 */
@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    @GetMapping("/update/{id}")
    public void updateStroageNum(@PathVariable("id") int id) {
        storageService.updateStorageNum(id);
    }
}
