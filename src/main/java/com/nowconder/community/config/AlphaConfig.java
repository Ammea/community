package com.nowconder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class AlphaConfig {

    @Bean
    public SimpleDateFormat simpleDateFormat(){//这个方法名就是bean的名字
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    }
    //方法返回的对象将作为一个bean 存到容器中
}
