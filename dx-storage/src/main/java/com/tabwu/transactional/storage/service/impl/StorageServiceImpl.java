package com.tabwu.transactional.storage.service.impl;

import com.tabwu.transactional.storage.mapper.StorageMapper;
import com.tabwu.transactional.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2023/7/17 16:00
 * @DESCRIPTION:
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    @Override
    public int updateStorageNum(int id) {
        System.out.println("storage execute....");
        return storageMapper.updateStorageNum(id);
    }
}
