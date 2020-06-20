package com.shengsiyuan.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public MyConfigBean getConfig() {
      return  new MyConfigBean();
    }
}
