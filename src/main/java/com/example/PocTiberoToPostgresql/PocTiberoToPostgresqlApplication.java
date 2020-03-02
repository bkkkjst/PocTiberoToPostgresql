package com.example.PocTiberoToPostgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("com.example.PocTiberoToPostgresql.model")
public class PocTiberoToPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocTiberoToPostgresqlApplication.class, args);
	}

}
