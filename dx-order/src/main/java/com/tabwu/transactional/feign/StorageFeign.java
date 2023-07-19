package com.tabwu.transactional.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2023/7/17 16:27
 * @DESCRIPTION:
 */
@FeignClient(name = "storage-server")
public interface StorageFeign {

    @GetMapping("/update/{id}")
    void updateStroageNum(@PathVariable("id") int id);
}
