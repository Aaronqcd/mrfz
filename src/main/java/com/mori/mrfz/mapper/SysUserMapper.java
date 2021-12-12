package com.mori.mrfz.mapper;

import com.mori.mrfz.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface SysUserMapper {
    SysUser findByUsername(String username);
}
