package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {
	
	@GetMapping("/")
	public String callIndexPage() {
		return "index";
	}
	
	@GetMapping("/home")
	public String callHomePage() {
		return "home";
	}
	
	@GetMapping("/tanmak2")
	public String callMyPage() {
		return "tanmak";
	}
	
	@GetMapping("/movie")
	public String callMoviePage() {
		return "movie";
	}
	@GetMapping("/login")
	public String callLoginPage() {
		return "login";
	}
}
