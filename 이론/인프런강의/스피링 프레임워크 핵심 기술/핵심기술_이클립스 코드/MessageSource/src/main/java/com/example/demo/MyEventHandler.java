package com.example.demo;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {
	
	@EventListener
	@Async
	public void handle(MyEvent event) {
		System.out.println(Thread.currentThread().toString());
		System.out.println(event.getData());
	}
	
	@EventListener
	@Async
	public void handle(ContextRefreshedEvent event) {
		System.out.println("ContextRef");
		System.out.println(Thread.currentThread().toString());
	}
	
	@EventListener
	@Async
	public void handle(ContextClosedEvent event) {
		System.out.println("ContextClosedEvent");
		System.out.println(Thread.currentThread().toString());
	}
}
