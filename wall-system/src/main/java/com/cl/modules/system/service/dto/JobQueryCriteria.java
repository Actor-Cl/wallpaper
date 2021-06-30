package com.cl.modules.system.service.dto;

import com.cl.annotation.Query;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author chenglei
 * @data 2021年05月2021/5/31日 15:12
 */
@Data
@AllArgsConstructor
public class JobQueryCriteria {
    @Query(type = Query.Type.INNER_LIKE)
    private String name;

    @Query
    private Boolean enabled;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;
}
