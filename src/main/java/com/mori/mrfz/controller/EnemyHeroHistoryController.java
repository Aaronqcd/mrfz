package com.mori.mrfz.controller;

import com.mori.mrfz.entity.EnemyHeroHistory;
import com.mori.mrfz.service.EnemyHeroHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EnemyHeroHistoryController {
    @Autowired
    private EnemyHeroHistoryService enemyHeroHistoryService;

    @RequestMapping(value = "/enemyHistory/create", method = RequestMethod.GET)
    public Integer create(EnemyHeroHistory enemyHeroHistory) {
        Integer id = enemyHeroHistoryService.add(enemyHeroHistory);
        return id;
    }
}
