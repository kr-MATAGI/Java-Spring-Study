package com.example.demo;

import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class Autowire1Application {

	
	@Autowired
	BookService bookSErvice;
	
	public static void main(String[] args) {
//		SpringApplication.run(Autowire1Application.class, args);
		var app = new SpringApplication(Autowire1Application.class);
		app.addInitializers(new ApplicationContextInitializer<GenericApplicationContext>() {
			@Override
			public void initialize(GenericApplicationContext ctx) {
				ctx.registerBean(BookService.class);
				ctx.registerBean(ApplicationRunner.class, new Supplier<ApplicationRunner>() {
					@Override
					public ApplicationRunner get() {
						return new ApplicationRunner() {
							
							@Override
							public void run(ApplicationArguments args) throws Exception {
								System.out.println("Fuctional Bean Definition");
								
							}
						};
					}
				});
			}
		});
		app.run(args);
	}
}
