package com.mori.mrfz.entity;

public class RecommendHero {
    private Integer id;
    private Integer sort;
    private Integer magicHeroId;
    private Integer battleInfoId;
    private MagicHero magicHero;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getMagicHeroId() {
        return magicHeroId;
    }

    public void setMagicHeroId(Integer magicHeroId) {
        this.magicHeroId = magicHeroId;
    }

    public Integer getBattleInfoId() {
        return battleInfoId;
    }

    public void setBattleInfoId(Integer battleInfoId) {
        this.battleInfoId = battleInfoId;
    }

    public MagicHero getMagicHero() {
        return magicHero;
    }

    public void setMagicHero(MagicHero magicHero) {
        this.magicHero = magicHero;
    }
}
