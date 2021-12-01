package com.mori.mrfz.mapper;

import com.mori.mrfz.entity.EnemyHero;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface EnemyHeroMapper {
    List<EnemyHero> findAll();
    List<EnemyHero> findEnemyHeroByCamp(Integer camp);
    Integer add(EnemyHero enemyHero);
}
