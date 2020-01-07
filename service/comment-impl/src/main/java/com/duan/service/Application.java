package com.duan.service;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Created on 2019/10/25.
 *
 * @author DuanJiaNing
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.duan.service")
@PropertySource("classpath:/dubbo-provider.properties")
@MapperScan("com.duan.service.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
