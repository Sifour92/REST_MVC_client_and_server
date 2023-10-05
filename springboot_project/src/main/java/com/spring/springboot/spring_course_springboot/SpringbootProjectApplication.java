package com.spring.springboot.spring_course_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(scanBasePackages = "") можно явго указать какие пакеты сканировать
public class  SpringbootProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootProjectApplication.class, args);
    }

}
