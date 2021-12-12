package com.mori.mrfz.config;

import com.mori.mrfz.interceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    // 将登录拦截器配置到容器中
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/index", "/login", "/battle/update", "/battle/create"
                        , "/enemy/findAllHero", "/welcome", "/enemyIndex", "/css/**"
                        , "/js/**", "/images/**", "/fonts/**", "/lib/**");
    }

    // 将视图解析器配置到容器中
    @Bean
    public ViewResolver myViewResolver() {
        return new MyViewResolver();
    }

    // 自定义一个视图解析器
    public static class MyViewResolver implements ViewResolver {
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }
}
