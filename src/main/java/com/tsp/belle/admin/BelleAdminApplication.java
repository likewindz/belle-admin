package com.tsp.belle.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tsp.belle.admin.dao")
public class BelleAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BelleAdminApplication.class, args);
    }

}
