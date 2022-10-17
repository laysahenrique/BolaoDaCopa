package com.laysafontoura.bolao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.laysafontoura.controllers.LoginController;
import com.laysafontoura.model.NationalTeamRepository;

@SpringBootApplication
@Import({LoginController.class, NationalTeamRepository.class})
public class BolaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BolaoApplication.class, args);
    }
}