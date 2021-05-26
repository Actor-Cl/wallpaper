package com.cl.service;

import com.cl.domain.GenConfig;

public interface  GenConfigService {

    /**
     * 查询表配置
     * @param tableName 表名称
     * @return 表配置
     */
    GenConfig find(String tableName);

    /**
     * 更新表配置
     * @param tableName 表名称
     * @param genConfig 表配置
     * @return 表配置
     */
    GenConfig update(String tableName,GenConfig genConfig);
}
