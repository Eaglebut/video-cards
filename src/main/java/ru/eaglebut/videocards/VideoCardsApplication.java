package ru.eaglebut.videocards;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class VideoCardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoCardsApplication.class, args);
	}

}
