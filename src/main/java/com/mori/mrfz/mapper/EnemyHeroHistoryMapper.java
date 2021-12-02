package com.mori.mrfz.mapper;

import com.mori.mrfz.entity.EnemyHeroHistory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface EnemyHeroHistoryMapper {
    Integer add(EnemyHeroHistory enemyHeroHistory);
}
