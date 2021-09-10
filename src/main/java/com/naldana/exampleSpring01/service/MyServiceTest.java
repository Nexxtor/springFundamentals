package com.naldana.exampleSpring01.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceTest implements MyService {

	@Override
	public void doBusinessLogic() {
		System.out.println("Exit of SERVICE MyServiceTest Oscar Doñas");
	}
	
	

}
