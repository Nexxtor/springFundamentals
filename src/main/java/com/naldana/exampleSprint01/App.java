package com.naldana.exampleSprint01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyService service = ctx.getBean(MyService.class);
		
		service.doBusinessLogic();
	}
	
}
