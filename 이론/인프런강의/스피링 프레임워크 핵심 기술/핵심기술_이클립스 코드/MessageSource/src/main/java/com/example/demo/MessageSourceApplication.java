package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class MessageSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageSourceApplication.class, args);
	}
	
	@Bean
	public MessageSource messageSource() {
		var msgSrc = new ReloadableResourceBundleMessageSource();
		msgSrc.setBasename("classpath:/messages");
		msgSrc.setCacheSeconds(3);
		return msgSrc;
	}

}
