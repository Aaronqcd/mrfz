package com.mori.mrfz.controller;

import com.mori.mrfz.entity.MagicHero;
import com.mori.mrfz.service.MagicHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MagicHeroController {
    @Autowired
    private MagicHeroService magicHeroService;

    @RequestMapping("/magic/findAll")
    @ResponseBody
    public List<MagicHero> findAll(){
        return magicHeroService.findAll();
    }
}
