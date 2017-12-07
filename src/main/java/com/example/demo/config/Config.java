package com.example.demo.config;

import com.example.demo.service.Service1;
import com.example.demo.service.Service2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xlg
 * @since 2017/12/5
 */
@Configuration
public class Config {

    @Bean
    public Service1 service1() {
        System.out.println("Config service1");
        return new Service1();
    }

    @Bean
    public Service2 service2() {
        service1();
        return new Service2(service1());
    }

}
