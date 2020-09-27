package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;


@Component
public class AppRunner implements ApplicationRunner {

	@Value("#{1 + 1}")
	int value;
	
	@Value("#{'hello ' + 'world'}")
	String greeting;
	
	@Value("#{1 eq 1}")
	boolean tureOrFalse;

	@Value("${my.value}")
	int myValue;
	
	@Value("#{100 eq ${my.value}}")
	boolean isValue100;
	
	@Value("#{sample.data}")
	int sampleData;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("================");
		System.out.println(value);
		System.out.println(greeting);
		System.out.println(tureOrFalse);
		System.out.println(myValue);
		System.out.println(isValue100);
		System.out.println(sampleData);
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("2 + 100");
		Integer intVal = exp.getValue(Integer.class); // conversionService 사용
		System.out.println(intVal);
		
	}
	
}
