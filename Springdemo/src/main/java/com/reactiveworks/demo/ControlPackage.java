package com.reactiveworks.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlPackage {
	
	@GetMapping("/get1")
	public String getFirstName() {
		return "Satish is my name";
	}
	@GetMapping("/get2")
	public String getLastName() {
		return "kumar is last name";
	}
	
}
