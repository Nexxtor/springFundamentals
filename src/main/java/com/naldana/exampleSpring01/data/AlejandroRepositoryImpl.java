package com.naldana.exampleSpring01.data;

import org.springframework.stereotype.Repository;

@Repository
public class AlejandroRepositoryImpl implements MyRepository {

	@Override
	public void doQuery() {
		System.out.println("New Repository");
	}
}
