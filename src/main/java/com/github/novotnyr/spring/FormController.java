package com.github.novotnyr.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form.form")
public class FormController {
    @GetMapping
    public String show() {
        return "form";
    }

    @PostMapping
    public String onSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }

    public static class Greeting {
        private String greeting;

        private String lang;

        public String getGreeting() {
            return greeting;
        }

        public void setGreeting(String greeting) {
            this.greeting = greeting;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }
    }
}
