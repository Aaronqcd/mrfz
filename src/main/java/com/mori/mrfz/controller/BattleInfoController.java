package com.mori.mrfz.controller;

import com.mori.mrfz.entity.BattleInfo;
import com.mori.mrfz.entity.EnemyHeroHistory;
import com.mori.mrfz.service.BattleInfoService;
import com.mori.mrfz.service.EnemyHeroHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BattleInfoController {
    @Autowired
    private BattleInfoService battleInfoService;
    @Autowired
    private EnemyHeroHistoryService enemyHeroHistoryService;

    @RequestMapping(value = "/battle/create", method = RequestMethod.POST)
    @ResponseBody
    public Integer create(BattleInfo battleInfo) {
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
        List<BattleInfo> list = battleInfoService.findInfo(battleInfo);
        Integer id = 0;
        if (list.size() == 0) {
            id = battleInfoService.add(battleInfo);
        }
        return id;
    }
}
