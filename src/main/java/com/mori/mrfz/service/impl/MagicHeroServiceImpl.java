package com.mori.mrfz.service.impl;

import com.mori.mrfz.entity.MagicHero;
import com.mori.mrfz.mapper.MagicHeroMapper;
import com.mori.mrfz.service.MagicHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("magicHeroService")
public class MagicHeroServiceImpl implements MagicHeroService {
    @Autowired
    private MagicHeroMapper magicHeroMapper;

    @Override
    public List<MagicHero> findAll() {
        return magicHeroMapper.findAll();
    }
}
