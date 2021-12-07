package com.mori.mrfz.controller;

import com.mori.mrfz.entity.MagicHero;
import com.mori.mrfz.entity.RecommendHero;
import com.mori.mrfz.service.MagicHeroService;
import com.mori.mrfz.service.RecommendHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecommendHeroController {
    @Autowired
    private RecommendHeroService recommendHeroService;

    @RequestMapping(value = "/recommend/create", method = RequestMethod.POST)
    @ResponseBody
    public Integer create(RecommendHero recommendHero) {
        Integer id = recommendHeroService.add(recommendHero);
        return id;
    }

    @RequestMapping(value = "/recommend/delete", method = RequestMethod.POST)
    @ResponseBody
    public Integer delete(Integer id) {
        Integer res = recommendHeroService.del(id);
        return res;
    }
}
