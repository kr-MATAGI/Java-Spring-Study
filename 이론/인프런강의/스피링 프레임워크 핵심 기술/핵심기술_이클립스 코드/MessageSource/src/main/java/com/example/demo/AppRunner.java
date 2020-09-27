package com.example.demo;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	MessageSource megSrc;
	
	@Autowired
	ApplicationEventPublisher pe;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
//		System.out.println(Locale.getDefault());
//		while(true)
//		{
//			System.out.println(megSrc.getMessage("greeting", new String[] {"jaehoon"}, Locale.KOREA));
//			System.out.println(megSrc.getMessage("greeting", new String[] {"jaehoon"}, Locale.getDefault()));
//			Thread.sleep(1000l);
//		}
		pe.publishEvent(new MyEvent(this, 100));
		
	}
	
}
