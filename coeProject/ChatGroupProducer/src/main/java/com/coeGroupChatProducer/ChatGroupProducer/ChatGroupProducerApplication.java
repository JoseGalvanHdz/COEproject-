package com.coeGroupChatProducer.ChatGroupProducer;

import com.coeGroupChatProducer.ChatGroupProducer.model.GroupChatDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class ChatGroupProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatGroupProducerApplication.class, args);

	}

}
