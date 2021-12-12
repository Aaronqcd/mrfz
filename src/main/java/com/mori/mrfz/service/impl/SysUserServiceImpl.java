package com.mori.mrfz.service.impl;

import com.mori.mrfz.entity.SysUser;
import com.mori.mrfz.mapper.SysUserMapper;
import com.mori.mrfz.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findByUsername(String username) {
        return sysUserMapper.findByUsername(username);
    }
}
