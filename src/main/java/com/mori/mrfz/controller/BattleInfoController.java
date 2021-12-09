package com.mori.mrfz.controller;

import com.mori.mrfz.entity.BattleInfo;
import com.mori.mrfz.entity.EnemyHero;
import com.mori.mrfz.entity.EnemyHeroHistory;
import com.mori.mrfz.entity.RecommendHero;
import com.mori.mrfz.service.BattleInfoService;
import com.mori.mrfz.service.EnemyHeroHistoryService;
import com.mori.mrfz.service.EnemyHeroService;
import com.mori.mrfz.service.RecommendHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BattleInfoController {
    @Autowired
    private BattleInfoService battleInfoService;
    @Autowired
    private RecommendHeroService recommendHeroService;
    @Autowired
    private EnemyHeroService enemyHeroService;
    @Autowired
    private EnemyHeroHistoryService enemyHeroHistoryService;

    @RequestMapping(value = "/battle/create", method = RequestMethod.POST)
    @ResponseBody
    public List<RecommendHero> create(BattleInfo battleInfo) {
//        if (battleInfo.getEnemyHeroFirst() == 0) {
//            battleInfo.setEnemyHeroFirst(null);
//        }
//        if (battleInfo.getEnemyHeroSecond() == 0) {
//            battleInfo.setEnemyHeroSecond(null);
//        }
//        if (battleInfo.getEnemyHeroThird() == 0) {
//            battleInfo.setEnemyHeroThird(null);
//        }
//        if (battleInfo.getEnemyHeroFourth() == 0) {
//            battleInfo.setEnemyHeroFourth(null);
//        }
        Arrays.sort(battleInfo.getIds());
        Integer[] ids = battleInfo.getIds();
        battleInfo.setEnemyHeroFirst(ids[0]);
        battleInfo.setEnemyHeroSecond(ids.length > 1 ? ids[1] : null);
        battleInfo.setEnemyHeroThird(ids.length > 2 ? ids[2] : null);
        battleInfo.setEnemyHeroFourth(ids.length > 3 ? ids[3] : null);
        List<BattleInfo> list = battleInfoService.findInfo(battleInfo);
        Integer id = 0;
        if (list.size() == 0) {
            battleInfo.setUsageTimes(1);
            battleInfo.setApprovalTimes(0);
            battleInfo.setObjectionsTimes(0);
            battleInfoService.add(battleInfo);
            id = battleInfo.getId();
        }
        else {
            BattleInfo info = list.get(0);
            Integer usageTimes = 1;
            if (info.getUsageTimes() != null) {
                usageTimes = info.getUsageTimes() + 1;
            }
            info.setUsageTimes(usageTimes);
            info.setSign(1);
            battleInfoService.update(info);
            id = info.getId();
        }
        List<RecommendHero> recommendHeroes = recommendHeroService.findByBattleInfoId(id);
        return recommendHeroes;
    }

    @RequestMapping(value = "/battle/findAll", method = RequestMethod.POST)
    @ResponseBody
    public List<BattleInfo> findAll(BattleInfo battleInfo) {
        String enemyHeroName = battleInfo.getName();
        if (enemyHeroName != null && !"".equals(enemyHeroName)) {
            EnemyHero enemyHero = enemyHeroService.findEnemyHeroByName(enemyHeroName);
            battleInfo.setEnemyHeroId(enemyHero.getId());
        }
        List<BattleInfo> battleInfos = battleInfoService.findAll(battleInfo);
        List<BattleInfo> resBattleInfos = new ArrayList<>(battleInfos.size());
        for (BattleInfo battle : battleInfos) {
            EnemyHero enemyHeroFirstInfo = enemyHeroService.findEnemyHeroById(battle.getEnemyHeroFirst());
            battle.setEnemyHeroFirstInfo(enemyHeroFirstInfo);
            if (battle.getEnemyHeroSecond() != null) {
                EnemyHero enemyHeroSecondInfo = enemyHeroService.findEnemyHeroById(battle.getEnemyHeroSecond());
                battle.setEnemyHeroSecondInfo(enemyHeroSecondInfo);
            }
            if (battle.getEnemyHeroThird() != null) {
                EnemyHero enemyHeroThirdInfo = enemyHeroService.findEnemyHeroById(battle.getEnemyHeroThird());
                battle.setEnemyHeroThirdInfo(enemyHeroThirdInfo);
            }
            if (battle.getEnemyHeroFourth() != null) {
                EnemyHero enemyHeroFourthInfo = enemyHeroService.findEnemyHeroById(battle.getEnemyHeroFourth());
                battle.setEnemyHeroFourthInfo(enemyHeroFourthInfo);
            }
            List<RecommendHero> recommendHeroes = recommendHeroService.findByBattleInfoId(battle.getId());
            battle.setRecommendHeroes(recommendHeroes);
            if (battleInfo.getNoReHero() != null && battleInfo.getNoReHero() == 1) {
                if (recommendHeroes.size() == 0) {
                    resBattleInfos.add(battle);
                }
            }
            else {
                resBattleInfos.add(battle);
            }
        }
        return resBattleInfos;
    }

    @RequestMapping(value = {"/battleIndex"})
    public String index() {
        return "battleIndex";
    }

    @RequestMapping(value = {"/battleIndexFirst"})
    public String indexFirst() {
        return "battleIndex1";
    }

    @RequestMapping(value = {"/battleIndexAdd"})
    public ModelAndView battleIndexAdd(Integer battleInfoId) {
        ModelAndView modelAndView = new ModelAndView("/member-add");
        modelAndView.addObject("battleInfoId", battleInfoId);
        return modelAndView;
    }

    @RequestMapping(value = "/battle/update", method = RequestMethod.POST)
    @ResponseBody
    public Integer update(BattleInfo battleInfo) {
        List<BattleInfo> battleInfos = battleInfoService.findAll(battleInfo);
        BattleInfo info = battleInfos.get(0);
        info.setSign(battleInfo.getSign());
        if (info.getSign() == 2) {
            info.setApprovalTimes((info.getApprovalTimes() == null ? 0 : info.getApprovalTimes()) + 1);
        }
        else if (info.getSign() == 3) {
            info.setObjectionsTimes((info.getObjectionsTimes() == null ? 0 : info.getObjectionsTimes()) + 1);
        }
        Integer result = battleInfoService.update(info);
        return result;
    }
}
