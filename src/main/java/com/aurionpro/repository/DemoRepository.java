package com.aurionpro.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {

	public int sum(int number1,int number2) {
		return number1+number2;
	}
}
