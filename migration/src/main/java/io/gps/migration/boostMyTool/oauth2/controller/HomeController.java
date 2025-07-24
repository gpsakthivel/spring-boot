package io.gps.migration.boostMyTool.oauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/"})
    public String home() {
        return "index";
    }

    @GetMapping("/user")
    public String userPage() {
        return "user";
    }
}
