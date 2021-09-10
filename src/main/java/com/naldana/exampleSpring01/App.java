package com.naldana.exampleSpring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naldana.exampleSpring01.config.LocalConfig;
import com.naldana.exampleSpring01.config.ProdConfig;
import com.naldana.exampleSpring01.service.AnotherMyServiceImpl;
import com.naldana.exampleSpring01.service.MyService;
import com.naldana.exampleSpring01.service.MyServiceImpl;
import com.naldana.exampleSpring01.service.MyServiceTest;


public class App {
	
	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "prod");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(LocalConfig.class,ProdConfig.class);
		
		
		MyService service = ctx.getBean(AnotherMyServiceImpl.class);
		MyService service2 = ctx.getBean(MyServiceImpl.class);
		MyService service3 = ctx.getBean(MyServiceTest.class);
		
		service.doBusinessLogic();
		service2.doBusinessLogic();
		service3.doBusinessLogic();
	}
	
}
