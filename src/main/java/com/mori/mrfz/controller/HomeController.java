package com.mori.mrfz.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = {"/enemyIndex"})
    public String enemyIndex() {
        return "enemy";
    }
    @RequestMapping(value = {"/welcome"})
    public String welcome() {
        return "welcome2";
    }
}
