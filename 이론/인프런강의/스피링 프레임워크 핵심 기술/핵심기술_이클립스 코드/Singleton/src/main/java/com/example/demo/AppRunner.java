package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
	
	@Autowired
	ApplicationContext appctx;
	
	@Autowired
	BookRepository bookRepository;
	
	@Value("${app.name}")
	String appName;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
//		System.out.println("proto");
//		System.out.println(appctx.getBean(Proto.class));
//		System.out.println(appctx.getBean(Proto.class));
//		System.out.println(appctx.getBean(Proto.class));
//
//		System.out.println("single");
//		System.out.println(appctx.getBean(Single.class));
//		System.out.println(appctx.getBean(Single.class));
//		System.out.println(appctx.getBean(Single.class));
//		
//		System.out.println("proto by single");
//		System.out.println(appctx.getBean(Single.class).getProto());
//		System.out.println(appctx.getBean(Single.class).getProto());
//		System.out.println(appctx.getBean(Single.class).getProto());
		
		Environment env = appctx.getEnvironment();
		System.out.println(Arrays.toString(env.getActiveProfiles()));
		System.out.println(Arrays.toString(env.getDefaultProfiles()));
		
		System.out.println(env.getProperty("app.name"));
		System.out.println(appName);
			
	}

}
