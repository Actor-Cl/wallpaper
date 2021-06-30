package com.cl.service.dto;

import java.sql.Timestamp;

/**
 * @author chenglei
 * @data 2021年05月2021/5/31日 10:08
 */
public class LogSmallDTO {
    private String description;

    private String requestIp;

    private Long time;

    private String address;

    private String browser;

    private Timestamp createTime;
}
