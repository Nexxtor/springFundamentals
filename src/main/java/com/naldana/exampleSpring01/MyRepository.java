package com.naldana.exampleSpring01;

import org.springframework.stereotype.Component;

@Component
public class MyRepository {

	public void doQuery() {
		System.out.println("Doing database query");
	}
}
