package com.mori.mrfz.service;

import com.mori.mrfz.entity.RecommendHero;

import java.util.List;

public interface RecommendHeroService {
    List<RecommendHero> findByBattleInfoId(Integer battleInfoId);
}
