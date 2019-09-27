package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage() {
        return "index";
    }

    @RequestMapping("/gitclone")
    public String gitclonepage() {
        return "gitclone";
    }

    @RequestMapping("/gitmerge")
    public String gitmergepage() {
        return "gitmerge";
    }

    @RequestMapping("/author")
    public String malbrightpage() {
        return "author";
    }

    @RequestMapping("/about")
    public String aboutpage() {
        return "about";
    }
}