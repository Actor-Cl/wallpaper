package com.cl.service.dto;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author chenglei
 * @data 2021年05月2021/5/31日 9:59
 */
@Data
public class LogErrorDTO {
    private Long id;

    private String username;

    private String description;

    private String method;

    private String params;

    private String browser;

    private String requestIp;

    private String address;

    private Timestamp createTime;
}
