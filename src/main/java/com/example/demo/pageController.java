package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {
	
	@GetMapping("/")
	public String callIndexPage() {
		return "index";
	}
}
