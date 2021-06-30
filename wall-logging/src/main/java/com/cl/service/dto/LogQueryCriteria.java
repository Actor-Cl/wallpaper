package com.cl.service.dto;

import com.cl.annotation.Query;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author chenglei
 * @data 2021年05月2021/5/31日 9:59
 */
@Data
public class LogQueryCriteria {
    @Query(blurry = "username,description,address,requestIp,method,params")
    private String blurry;

    @Query
    private String logType;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;
}
