package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		ApplicationContext context = 
//				new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//		String[] beanDefNames = context.getBeanDefinitionNames();
//		System.out.println(Arrays.toString(beanDefNames));
//		
//		BookService bookService = (BookService) context.getBean("bookService");
//		System.out.println(bookService.bookRepository != null); // 의존성 주입이 되어있는지 확인
	}
}
