package com.cl.modules.system.service.dto;

import com.cl.base.BaseDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author chenglei
 * @data 2021年05月2021/5/28日 17:55
 */
@Setter
@Getter
public class DictDto extends BaseDTO implements Serializable {
    private Long id;

    private List<DictDetailDto> dictDetails;

    private String name;

    private String description;
}
