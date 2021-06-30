package com.cl.modules.system.service.dto;

import com.cl.annotation.Query;
import lombok.Data;

/**
 * @author chenglei
 * @data 2021年05月2021/5/28日 17:31
 */
@Data
public class DictDetailQueryCriteria {

    @Query(type = Query.Type.INNER_LIKE)
    private String label;

    @Query(propName = "name",joinName = "dict")
    private String dictName;
}
