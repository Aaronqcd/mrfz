package com.mori.mrfz.entity;

import java.io.Serializable;

public class EnemyHero implements Serializable {
    private Integer id;
    private String name;
    private Integer camp;
    private Integer magicStrength;
    private String pic;
    private Integer order;

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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
