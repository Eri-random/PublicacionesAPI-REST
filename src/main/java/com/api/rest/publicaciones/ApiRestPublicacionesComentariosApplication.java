package com.api.rest.publicaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ApiRestPublicacionesComentariosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiRestPublicacionesComentariosApplication.class, args);
    }

}
