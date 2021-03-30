package com.web.guihe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
@MapperScan("com.web.guihe.Mapper")
public class GuiheApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuiheApplication.class, args);
    }

}
