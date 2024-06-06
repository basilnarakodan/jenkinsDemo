package com.aurionpro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.repository.DemoRepository;

@Service
public class DemoService {
	
	@Autowired
	DemoRepository demoRepository;
	
	public int sum(int number1,int number2) {
		return demoRepository.sum(number1, number2);
	}
}
