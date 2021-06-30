package com.cl.modules.system.service.mapstruct;

import com.cl.base.BaseMapper;
import com.cl.modules.system.domain.Job;
import com.cl.modules.system.service.dto.JobDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",uses = {DeptMapper.class},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobMapper extends BaseMapper<JobDto, Job> {
}
