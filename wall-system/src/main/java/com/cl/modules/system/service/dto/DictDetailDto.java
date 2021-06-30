package com.cl.modules.system.service.dto;

import com.cl.base.BaseDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author chenglei
 * @data 2021年05月2021/5/28日 17:29
 */
@Setter
@Getter
public class DictDetailDto extends BaseDTO implements Serializable {

    private Long id;

    private DictSmallDto dict;

    private String label;

    private String value;

    private Integer dictSort;
}
