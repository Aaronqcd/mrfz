package com.mori.mrfz.controller;

import com.mori.mrfz.entity.EnemyHero;
import com.mori.mrfz.service.EnemyHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EnemyHeroController {
    @Autowired
    private EnemyHeroService enemyHeroService;

    @RequestMapping(value = {"/enemy"})
    public String index() {
        return "member-list2";
    }

    @RequestMapping("/enemy/findAll")
    @ResponseBody
    public List<EnemyHero> findAll(){
        return enemyHeroService.findAll();
    }

    @RequestMapping(value = "/enemy/create", method = RequestMethod.GET)
    public String create(EnemyHero enemyHero) {
        Integer id = enemyHeroService.add(enemyHero);
        return "redirect:/enemy";
    }
}
