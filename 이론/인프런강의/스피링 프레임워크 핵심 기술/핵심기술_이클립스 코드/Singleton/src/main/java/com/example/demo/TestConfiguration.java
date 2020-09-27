package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TestConfiguration {

	@Bean
	public BookRepository bookRepository() {
		return new TestBookRepository();
	}
	
}
