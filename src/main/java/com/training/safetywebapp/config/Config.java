package com.training.safetywebapp.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.safetywebapp.filter.BasicAuthorityFilter;

@Configuration
public class Config {


    /**
     *	フィルタ1のオブジェクトをコンポーネントに追加
     * @return フィルタ1を登録したBean
     */
    @Bean
    public FilterRegistrationBean basicAuthorityFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new BasicAuthorityFilter());
        bean.addUrlPatterns("/basicAuthority");
        bean.setOrder(1);
        return bean;
    }
}
