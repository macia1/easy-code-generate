package com.easy.generate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zenggs
 * @Date 2022/12/7
 */
@SpringBootApplication
@MapperScan("com.easy.generate.dao")
public class EasyCodeApplication {
    public static void main(String[] args) {

        SpringApplication.run(EasyCodeApplication.class,args);
    }
}
