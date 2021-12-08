package com.mori.mrfz.entity;

import java.util.List;

public class BattleInfo {
    private Integer id;
    private Integer enemyHeroFirst;
    private Integer enemyHeroSecond;
    private Integer enemyHeroThird;
    private Integer enemyHeroFourth;
    private Integer currentLayer;
    private Integer degree;
    private Integer usageTimes;
    private Integer approvalTimes;
    private Integer objectionsTimes;
    private Integer[] ids;
    private EnemyHero enemyHeroFirstInfo;
    private EnemyHero enemyHeroSecondInfo;
    private EnemyHero enemyHeroThirdInfo;
    private EnemyHero enemyHeroFourthInfo;
    private List<RecommendHero> recommendHeroes;
    private String name;
    private Integer enemyHeroId;
    private Integer sign;

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

    public Integer getUsageTimes() {
        return usageTimes;
    }

    public void setUsageTimes(Integer usageTimes) {
        this.usageTimes = usageTimes;
    }

    public Integer getApprovalTimes() {
        return approvalTimes;
    }

    public void setApprovalTimes(Integer approvalTimes) {
        this.approvalTimes = approvalTimes;
    }

    public Integer getObjectionsTimes() {
        return objectionsTimes;
    }

    public void setObjectionsTimes(Integer objectionsTimes) {
        this.objectionsTimes = objectionsTimes;
    }

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public EnemyHero getEnemyHeroFirstInfo() {
        return enemyHeroFirstInfo;
    }

    public void setEnemyHeroFirstInfo(EnemyHero enemyHeroFirstInfo) {
        this.enemyHeroFirstInfo = enemyHeroFirstInfo;
    }

    public EnemyHero getEnemyHeroSecondInfo() {
        return enemyHeroSecondInfo;
    }

    public void setEnemyHeroSecondInfo(EnemyHero enemyHeroSecondInfo) {
        this.enemyHeroSecondInfo = enemyHeroSecondInfo;
    }

    public EnemyHero getEnemyHeroThirdInfo() {
        return enemyHeroThirdInfo;
    }

    public void setEnemyHeroThirdInfo(EnemyHero enemyHeroThirdInfo) {
        this.enemyHeroThirdInfo = enemyHeroThirdInfo;
    }

    public EnemyHero getEnemyHeroFourthInfo() {
        return enemyHeroFourthInfo;
    }

    public void setEnemyHeroFourthInfo(EnemyHero enemyHeroFourthInfo) {
        this.enemyHeroFourthInfo = enemyHeroFourthInfo;
    }

    public List<RecommendHero> getRecommendHeroes() {
        return recommendHeroes;
    }

    public void setRecommendHeroes(List<RecommendHero> recommendHeroes) {
        this.recommendHeroes = recommendHeroes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEnemyHeroId() {
        return enemyHeroId;
    }

    public void setEnemyHeroId(Integer enemyHeroId) {
        this.enemyHeroId = enemyHeroId;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }
}
