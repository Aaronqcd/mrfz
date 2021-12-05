package com.mori.mrfz.entity;

public class MagicHero {
    private Integer id;
    private String name;
    private Integer camp;
    private Integer magicStrength;
    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCamp() {
        return camp;
    }

    public void setCamp(Integer camp) {
        this.camp = camp;
    }

    public Integer getMagicStrength() {
        return magicStrength;
    }

    public void setMagicStrength(Integer magicStrength) {
        this.magicStrength = magicStrength;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
