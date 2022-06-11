package com.github.novotnyr.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class WebConfiguration {
    @Bean
    IndexController indexController() {
        return new IndexController();
    }

    @Bean
    FormController formController() {
        return new FormController();
    }

    /**
     * Establishing a bean allows to expose custom view resolver.
     * <p>
     *     In this case, we expose Struts-like aliasing resolution.
     * </p>
     */
    @Bean
    ViewResolver viewResolver() {
        return new AliasingJspViewResolver()
                .alias("result", "submitted-form");
    }
}
