package com.example.demo;

import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner{

	@Autowired
	ResourceLoader resourceLoader;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Resource res = resourceLoader.getResource("classpath:test.txt");
		System.out.println(res.exists());
		System.out.println(res.getURI());
		String readStr = Files.readString(Path.of(res.getURI()));
		System.out.println(readStr);
	}

}
