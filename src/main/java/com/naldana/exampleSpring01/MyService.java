package com.naldana.exampleSpring01;

public class MyService {
	
	private MyRepository repository;
	
	
	public MyService(MyRepository repository) {
		this.repository = repository;
	}

	public void doBusinessLogic() {
		System.out.println("Doing some business logic!");
		repository.doQuery();
	}

}
