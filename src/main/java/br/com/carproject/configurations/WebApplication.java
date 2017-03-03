package br.com.carproject.configurations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.projetocarro.controllers")
public class WebApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(WebApplication.class, args);
    }
}