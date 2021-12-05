package com.mori.mrfz.service.impl;

import com.mori.mrfz.entity.BattleInfo;
import com.mori.mrfz.mapper.BattleInfoMapper;
import com.mori.mrfz.service.BattleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("battleInfoService")
public class BattleInfoServiceImpl implements BattleInfoService {
    @Autowired
    private BattleInfoMapper battleInfoMapper;

    @Override
    public List<BattleInfo> findAll() {
        return battleInfoMapper.findAll();
    }

    @Override
    public List<BattleInfo> findInfo(BattleInfo battleInfo) {
        return battleInfoMapper.findInfo(battleInfo);
    }

    @Override
    public Integer add(BattleInfo battleInfo) {
        return battleInfoMapper.add(battleInfo);
    }
}
