package com.mori.mrfz.mapper;

import com.mori.mrfz.entity.RecommendHero;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface RecommendHeroMapper {
    List<RecommendHero> findByBattleInfoId(Integer battleInfoId);
    Integer add(RecommendHero recommendHero);
    Integer del(Integer id);
}
