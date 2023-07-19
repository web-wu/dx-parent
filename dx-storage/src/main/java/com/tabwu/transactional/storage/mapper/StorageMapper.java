package com.tabwu.transactional.storage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tabwu.transactional.storage.entity.Storage;
import org.apache.ibatis.annotations.Update;

/**
 * @PROJECT_NAME: dx-parent
 * @USER: tabwu
 * @DATE: 2023/7/17 15:56
 * @DESCRIPTION:
 */
public interface StorageMapper extends BaseMapper<Storage> {

    @Update("update `storage` set num = num - 1 where id = #{id}")
    int updateStorageNum(int id);
}
