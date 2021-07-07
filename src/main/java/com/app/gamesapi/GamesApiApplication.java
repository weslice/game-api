package com.app.gamesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({
		"classpath:application-local.properties"
})
public class GamesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamesApiApplication.class, args);
	}

}
