package com.mori.mrfz.service;

import com.mori.mrfz.entity.SysUser;

public interface SysUserService {
    SysUser findByUsername(String username);
}
