package com.cl.modules.system.service.dto;

import lombok.Data;

/**
 * @author chenglei
 * @data 2021年05月2021/5/27日 16:20
 */
@Data
public class RoleSmallDto {
    private Long id;

    private String name;

    private Integer level;

    private String dataScope;
}
