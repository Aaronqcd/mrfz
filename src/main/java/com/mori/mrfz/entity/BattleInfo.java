package com.mori.mrfz.entity;

public class BattleInfo {
    private Integer id;
    private Integer enemyHeroFirst;
    private Integer enemyHeroSecond;
    private Integer enemyHeroThird;
    private Integer enemyHeroFourth;
    private Integer currentLayer;
    private Integer degree;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnemyHeroFirst() {
        return enemyHeroFirst;
    }

    public void setEnemyHeroFirst(Integer enemyHeroFirst) {
        this.enemyHeroFirst = enemyHeroFirst;
    }

    public Integer getEnemyHeroSecond() {
        return enemyHeroSecond;
    }

    public void setEnemyHeroSecond(Integer enemyHeroSecond) {
        this.enemyHeroSecond = enemyHeroSecond;
    }

    public Integer getEnemyHeroThird() {
        return enemyHeroThird;
    }

    public void setEnemyHeroThird(Integer enemyHeroThird) {
        this.enemyHeroThird = enemyHeroThird;
    }

    public Integer getEnemyHeroFourth() {
        return enemyHeroFourth;
    }

    public void setEnemyHeroFourth(Integer enemyHeroFourth) {
        this.enemyHeroFourth = enemyHeroFourth;
    }

    public Integer getCurrentLayer() {
        return currentLayer;
    }

    public void setCurrentLayer(Integer currentLayer) {
        this.currentLayer = currentLayer;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }
}
