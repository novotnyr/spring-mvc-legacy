package com.github.novotnyr.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class AliasingJspViewResolver implements ViewResolver, ApplicationContextAware {
    private InternalResourceViewResolver delegateViewResolver = new InternalResourceViewResolver("/WEB-INF/", ".jsp");

    private Map<String, String> viewAliases = new HashMap<>();

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        String viewNameAlias = viewAliases.getOrDefault(viewName, viewName);
        return this.delegateViewResolver.resolveViewName(viewNameAlias, locale);
    }

    public AliasingJspViewResolver alias(String originalName, String alias) {
        this.viewAliases.put(originalName, alias);
        return this;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.delegateViewResolver.setApplicationContext(applicationContext);
    }
}
