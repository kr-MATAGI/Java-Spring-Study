package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PefAspect {
	
	@Around("execution(* com.example.demo.EventService.*(..))")
//	@Around("@annotation(PerfLogging)")
//	@Around("bean(simpleEventService)")
	public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
		// createdEvent(), publishedEvent
		long begin = System.currentTimeMillis();
		
		Object retVal = pjp.proceed();
		
		System.out.println(System.currentTimeMillis() - begin);
		
		return retVal;
	}
	
	@Before("bean(simpleEventService)")
	public void hello() {
		System.out.println("Hello");
	}
	
}
