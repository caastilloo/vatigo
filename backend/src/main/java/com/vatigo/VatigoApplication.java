package com.vatigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Punto de entrada de la aplicación.
 */
@SpringBootApplication
@EnableScheduling
public class VatigoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VatigoApplication.class, args);
    }
}
