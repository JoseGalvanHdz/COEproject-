package com.coe.coeGroup_Chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class CoeGroupChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoeGroupChatApplication.class, args);
	}

}
