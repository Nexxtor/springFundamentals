package com.naldana.exampleSpring01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
	
	@Autowired
	private MyRepository repository;
	
	public MyServiceImpl(MyRepository repository) {
		this.repository = repository;
	}

	public void doBusinessLogic() {
		System.out.println("Doing some business logic!");
		repository.doQuery();
	}

}
