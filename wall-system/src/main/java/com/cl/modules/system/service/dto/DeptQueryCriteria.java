package com.cl.modules.system.service.dto;

import com.cl.annotation.DataPermission;
import com.cl.annotation.Query;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author chenglei
 * @data 2021年05月2021/5/28日 10:12
 */
@Data
@DataPermission(fieldName = "id")
public class DeptQueryCriteria {
    @Query(type = Query.Type.INNER_LIKE)
    private String name;

    @Query
    private Boolean enabled;

    @Query
    private Long pid;

    @Query(type = Query.Type.IS_NULL, propName = "pid")
    private Boolean pidIsNull;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;
}
