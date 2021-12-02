package com.mori.mrfz.service;

import com.mori.mrfz.entity.BattleInfo;

import java.util.List;

public interface BattleInfoService {
    List<BattleInfo> findInfo(BattleInfo battleInfo);
    Integer add(BattleInfo battleInfo);
}
