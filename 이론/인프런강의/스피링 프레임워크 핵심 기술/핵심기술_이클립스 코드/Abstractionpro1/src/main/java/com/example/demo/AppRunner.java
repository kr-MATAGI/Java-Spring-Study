package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	ApplicationContext appCtx;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("aaa");
		System.out.println(appCtx.getClass());
		
		Resource resource = appCtx.getResource("classpath:test.txt");
		System.out.println(resource.exists());
		System.out.println(resource.getClass());
	}	
	
}
