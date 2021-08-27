package com.naldana.exampleSpring01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.naldana.exampleSpring01.data.MyRepository;

@Service
public class MyServiceImpl implements MyService {
	

	private MyRepository repository;
	
	@Autowired
	public MyServiceImpl(@Qualifier("myRepositoryImpl") MyRepository repository) {
		this.repository = repository;
	}

	@Override
	public void doBusinessLogic() {
		System.out.println("Doing some business logic!");
		repository.doQuery();
	}

}
