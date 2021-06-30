package com.cl.modules.system.service.dto;

import com.cl.annotation.Query;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author chenglei
 * @data 2021年05月2021/5/27日 16:55
 */
@Data
public class RoleQueryCriteria {
    @Query(blurry = "name,description")
    private String blurry;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;
}
