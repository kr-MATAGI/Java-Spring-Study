package com.example.demo;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnotherEventHandler {
	
	@EventListener
	@Async
	public void handle(MyEvent event)
	{
		System.out.println("Another Event Handler!");
		System.out.println(Thread.currentThread().toString());
		System.out.println(event.getData());
		System.out.println(event.getSource());
	}
}
