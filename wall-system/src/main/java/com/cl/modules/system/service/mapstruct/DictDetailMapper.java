package com.cl.modules.system.service.mapstruct;

import com.cl.base.BaseMapper;
import com.cl.modules.system.domain.DictDetail;
import com.cl.modules.system.service.dto.DictDetailDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author chenglei
 * @data 2021年05月2021/5/28日 17:58
 */
@Mapper(componentModel = "spring", uses = {DictSmallMapper.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DictDetailMapper extends BaseMapper<DictDetailDto, DictDetail> {
}
