package com.bsoft;

import com.bsoft.client.AdiconWebServiceSoap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;

@SpringBootApplication
@ComponentScan
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);

        AdiconWs adiWs = new AdiconWs();
        adiWs.adiconWs();
    }
}
