package com.mori.mrfz.service.impl;

import com.mori.mrfz.entity.EnemyHero;
import com.mori.mrfz.mapper.EnemyHeroMapper;
import com.mori.mrfz.service.EnemyHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("enemyHeroService")
public class EnemyHeroServiceImpl implements EnemyHeroService {
    @Autowired
    private EnemyHeroMapper enemyHeroMapper;

    @Override
    public List<EnemyHero> findAll() {
        return enemyHeroMapper.findAll();
    }

    @Override
    public List<EnemyHero> findEnemyHeroByCamp(Integer camp) {
        return enemyHeroMapper.findEnemyHeroByCamp(camp);
    }

    @Override
    public EnemyHero findEnemyHeroById(Integer id) {
        return enemyHeroMapper.findEnemyHeroById(id);
    }

    public Integer add(EnemyHero enemyHero) {
        return enemyHeroMapper.add(enemyHero);
    }
}
