package com.github.novotnyr.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/index.form")
    public String showIndex() {
        return "/WEB-INF/index.jsp";
    }
}
