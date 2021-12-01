package com.mori.mrfz.controller;

import com.mori.mrfz.entity.EnemyHero;
import com.mori.mrfz.service.EnemyHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EnemyHeroController {
    @Autowired
    private EnemyHeroService enemyHeroService;

    @RequestMapping(value = {"/enemy"})
    public String index() {
        return "member-list2";
    }

    @RequestMapping("/enemy/findAllHero")
    @ResponseBody
    public Map<Integer, List<EnemyHero>> findAllHero(){
        Map<Integer, List<EnemyHero>> map = new HashMap<>();
        for (int i = 1; i <= 6; i++) {
            map.put(i, findEnemyHeroByCamp(i));
        }
        return map;
    }

    @RequestMapping("/enemy/findAll")
    @ResponseBody
    public List<EnemyHero> findAll(){
        return enemyHeroService.findAll();
    }

    @RequestMapping("/enemy/camp")
    @ResponseBody
    public List<EnemyHero> findEnemyHeroByCamp(Integer camp){
        return enemyHeroService.findEnemyHeroByCamp(camp);
    }

    @RequestMapping(value = "/enemy/create", method = RequestMethod.GET)
    public String create(EnemyHero enemyHero) {
        Integer id = enemyHeroService.add(enemyHero);
        return "redirect:/enemy";
    }
}
