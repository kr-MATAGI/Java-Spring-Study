package com.example.demo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	@PostConstruct
	public void setup()
	{
		System.out.println("bookService setup!");
	}
	
	public void printBookRepository() {
		
	}
	
	
}
