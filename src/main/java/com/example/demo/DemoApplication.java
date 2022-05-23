package com.example.demo;

import com.example.demo.entites.Etudient;
import com.example.demo.repositories.EtudientRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

       SpringApplication.run(DemoApplication.class, args);
    }
    @Bean
CommandLineRunner start(EtudientRespository EtudR){

        return args -> {

            EtudR.save(new Etudient(null,"rachid"));
            EtudR.save(new Etudient(null,"brahim"));
            EtudR.save(new Etudient(null,"mohamed"));
            EtudR.save(new Etudient(null,"hafida"));
            EtudR.save(new Etudient(null,"mustapha"));
            EtudR.save(new Etudient(null,"fatima"));
            EtudR.findAll().forEach(etudient -> {
                System.out.print(etudient.getNom());
            });
        };
}
}
