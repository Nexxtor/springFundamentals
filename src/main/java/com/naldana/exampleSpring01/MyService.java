package com.naldana.exampleSpring01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {
	
	@Autowired
	private MyRepository repository;
	
	public void doBusinessLogic() {
		System.out.println("Doing some business logic!");
		repository.doQuery();
	}

}
