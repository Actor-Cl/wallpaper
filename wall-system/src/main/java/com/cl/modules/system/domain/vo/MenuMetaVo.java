package com.cl.modules.system.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author chenglei
 * @data 2021年05月2021/5/28日 15:30
 */
@Data
@AllArgsConstructor
public class MenuMetaVo implements Serializable {
    private String title;

    private String icon;

    private Boolean noCache;
}
