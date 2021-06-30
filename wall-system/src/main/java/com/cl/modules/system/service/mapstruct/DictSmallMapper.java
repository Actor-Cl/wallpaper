package com.cl.modules.system.service.mapstruct;

import com.cl.base.BaseMapper;
import com.cl.modules.system.domain.Dict;
import com.cl.modules.system.service.dto.DictSmallDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DictSmallMapper extends BaseMapper<DictSmallDto, Dict> {
}
