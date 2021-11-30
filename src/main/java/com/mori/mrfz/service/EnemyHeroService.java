package com.mori.mrfz.service;

import com.mori.mrfz.entity.EnemyHero;

import java.util.List;

public interface EnemyHeroService {
    List<EnemyHero> findAll();
    Integer add(EnemyHero enemyHero);
}
