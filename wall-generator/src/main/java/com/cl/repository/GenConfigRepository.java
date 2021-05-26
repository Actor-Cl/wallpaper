package com.cl.repository;

import com.cl.domain.GenConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenConfigRepository extends JpaRepository<GenConfig,Long> {

    /**
     * 查询表配置
     * @param tableName
     * @return
     */
    GenConfig findByTableName(String tableName);
}
