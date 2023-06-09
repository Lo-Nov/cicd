package io.eclectics.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdApplication {

	@GetMapping("/test")
	public String message(){
		return "welcome to my first jenkins cicd test";
	}
	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
