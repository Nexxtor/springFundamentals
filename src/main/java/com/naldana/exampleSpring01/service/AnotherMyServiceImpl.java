package com.naldana.exampleSpring01.service;

import org.springframework.stereotype.Service;

@Service
public class AnotherMyServiceImpl implements MyService {
	
	@Override
	public void doBusinessLogic() {
		System.out.println("Doing some another business logic!");
	}

}
