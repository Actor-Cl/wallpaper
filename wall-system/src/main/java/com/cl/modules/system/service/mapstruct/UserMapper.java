package com.cl.modules.system.service.mapstruct;

import com.cl.base.BaseMapper;
import com.cl.modules.system.domain.User;
import com.cl.modules.system.service.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",uses = {RoleMapper.class, DeptMapper.class, JobMapper.class},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper extends BaseMapper<UserDto, User> {
}
