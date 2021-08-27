package com.naldana.exampleSpring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naldana.exampleSpring01.service.AnotherMyServiceImpl;
import com.naldana.exampleSpring01.service.MyService;
import com.naldana.exampleSpring01.service.MyServiceImpl;


public class App {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		MyService service = ctx.getBean(AnotherMyServiceImpl.class);
		MyService service2 = ctx.getBean(MyServiceImpl.class);
		
		service.doBusinessLogic();
		service2.doBusinessLogic();
	}
	
}
