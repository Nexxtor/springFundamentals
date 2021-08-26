package com.naldana.exampleSpring01;

public class MyService {
	
	private MyRepository repository;
	
	public void doBusinessLogic() {
		System.out.println("Doing some business logic!");
		repository.doQuery();
	}

	public void setRepository(MyRepository repository) {
		this.repository = repository;
	}
	
	
}
