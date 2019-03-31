package com.haole.rocketmq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 *
 * @author shengjunzhao
 * @date 2019/3/31
 */
@SpringBootApplication(scanBasePackages = { "com.haole.rocketmq" })
@MapperScan("com.haole.rocketmq.dao")
public class App {


    public static void main(String[] args) throws IOException {
        SpringApplication application = new SpringApplication(App.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
