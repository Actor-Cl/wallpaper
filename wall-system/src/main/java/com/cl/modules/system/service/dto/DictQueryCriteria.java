package com.cl.modules.system.service.dto;

import com.cl.annotation.Query;
import lombok.Data;

/**
 * @author chenglei
 * @data 2021年05月2021/5/28日 17:56
 */
@Data
public class DictQueryCriteria {
    @Query(blurry = "name,description")
    private String blurry;
}
