package com.naldana.exampleSpring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext("com.naldana.exampleSpring01");
		MyService service = ctx.getBean(MyService.class);
		
		service.doBusinessLogic();
	}
	
}
