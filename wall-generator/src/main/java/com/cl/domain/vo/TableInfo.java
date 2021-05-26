package com.cl.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表的数据信息
 * @author chenglei
 * @data 2021年05月2021/5/26日 14:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableInfo {
    /** 表名称 */
    private Object tableName;

    /** 创建日期 */
    private Object createTime;

    /** 数据库引擎 */
    private Object engine;

    /** 编码集 */
    private Object coding;

    /** 备注 */
    private Object remark;
}
