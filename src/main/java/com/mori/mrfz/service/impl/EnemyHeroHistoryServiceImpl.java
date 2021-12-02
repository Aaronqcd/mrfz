package com.mori.mrfz.service.impl;

import com.mori.mrfz.entity.EnemyHeroHistory;
import com.mori.mrfz.mapper.EnemyHeroHistoryMapper;
import com.mori.mrfz.service.EnemyHeroHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("enemyHeroHistoryService")
public class EnemyHeroHistoryServiceImpl implements EnemyHeroHistoryService {
    @Autowired
    private EnemyHeroHistoryMapper enemyHeroHistoryMapper;

    @Override
    public Integer add(EnemyHeroHistory enemyHeroHistory) {
        return enemyHeroHistoryMapper.add(enemyHeroHistory);
    }
}
