package com.mori.mrfz.mapper;

import com.mori.mrfz.entity.MagicHero;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface MagicHeroMapper {
    List<MagicHero> findAll();
}
