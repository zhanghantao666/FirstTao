package com.qf.j1808.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class longinController {
    @RequestMapping("/")
    public String login(){
        return "welocome come springboot";
    }
}
