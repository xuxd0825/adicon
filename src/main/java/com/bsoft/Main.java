package com.bsoft;

import com.bsoft.mybatis.departmentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.swing.*;

@SpringBootApplication
@EnableScheduling
public class Main {



    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);

    }
}
