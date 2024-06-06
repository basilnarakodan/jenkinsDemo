package com.aurionpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.service.DemoService;

@RestController
@RequestMapping("/calculate")
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@GetMapping("/sum")
	public int sum(@RequestParam int number1, @RequestParam int number2) {
		return demoService.sum(number1, number2);
	}
}
