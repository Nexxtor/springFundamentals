package com.naldana.exampleSpring01.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.naldana.exampleSpring01.data.MyRepository;

@Service
public class MyServiceImpl implements MyService, EnvironmentAware {
	
	@Value("${app.name:Spring}")
	private String name;

	private MyRepository repository;
	
	private Environment enviroment;
	
	@Autowired
	public MyServiceImpl(@Qualifier("myRepositoryImpl") MyRepository repository) {
		this.repository = repository;
	}

	@Override
	public void doBusinessLogic() {
		System.out.println("Doing some business logic for " + name);
		System.out.println("Con los perfiles " + Arrays.toString(this.enviroment.getActiveProfiles()));
		repository.doQuery();
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.enviroment = environment;		
	}

}
