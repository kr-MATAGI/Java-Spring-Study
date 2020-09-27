package com.example.demo;

import org.springframework.core.convert.converter.Converter;

public class EventConverter {
	
	public static class StringToEventConverter implements Converter<String, Event>{

		@Override
		public Event convert(String value) {
			return new Event(Integer.parseInt(value));
		}

	}
	
	public static class EventToStringConver implements Converter<Event, String> {

		@Override
		public String convert(Event value) {
			return value.getId().toString();
		}

		
	}
}
