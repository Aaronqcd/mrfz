package com.mori.mrfz.service;

import com.mori.mrfz.entity.EnemyHero;

import java.util.List;

public interface EnemyHeroService {
    List<EnemyHero> findAll();
    List<EnemyHero> findEnemyHeroByCamp(Integer camp);
    EnemyHero findEnemyHeroById(Integer id);
    Integer add(EnemyHero enemyHero);
}
