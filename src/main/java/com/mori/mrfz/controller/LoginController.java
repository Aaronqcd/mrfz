package com.mori.mrfz.controller;

import com.mori.mrfz.entity.SysUser;
import com.mori.mrfz.service.SysUserService;
import com.mori.mrfz.utils.Md5Utils;
import com.mori.mrfz.utils.MyMD5;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model,
            HttpSession session) {
        SysUser sysUser = sysUserService.findByUsername(username);
        if (sysUser != null && sysUser.getPassword().equals(Md5Utils.md5PlusSalt(password))) {
            session.setAttribute("loginUser", username);
            session.setAttribute("nickname", sysUser.getNickname());
            return "redirect:/battleIndex";
        } else {
            model.addAttribute("msg", "用户名或密码错误！");
            return "login";
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index() {
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
