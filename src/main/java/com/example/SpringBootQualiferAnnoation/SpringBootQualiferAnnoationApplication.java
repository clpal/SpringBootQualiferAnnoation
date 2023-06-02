package com.example.SpringBootQualiferAnnoation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootQualiferAnnoationApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootQualiferAnnoationApplication.class, args);
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfiguration.class);
	MessageProcessor messageProcessor=applicationContext.getBean(MessageProcessor.class);
	messageProcessor.processMsg("twitter message sending ");
	}

}
