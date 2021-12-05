package com.mori.mrfz.service.impl;

import com.mori.mrfz.entity.RecommendHero;
import com.mori.mrfz.mapper.RecommendHeroMapper;
import com.mori.mrfz.service.RecommendHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("recommendHeroService")
public class RecommendHeroServiceImpl implements RecommendHeroService {
    @Autowired
    private RecommendHeroMapper recommendHeroMapper;

    @Override
    public List<RecommendHero> findByBattleInfoId(Integer battleInfoId) {
        return recommendHeroMapper.findByBattleInfoId(battleInfoId);
    }
}
