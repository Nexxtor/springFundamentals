package com.naldana.exampleSpring01;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryImpl implements MyRepository {

	@Override
	public void doQuery() {
		System.out.println("Doing database query");
	}
}
