package com.example.demo;

import org.springframework.context.ApplicationEvent;

public class MyEvent {

	private int data;
	
	private Object source;
	
	public Object getSource() {
		return source;
	}

	public MyEvent(Object source, int data) {
		this.source = source;
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
