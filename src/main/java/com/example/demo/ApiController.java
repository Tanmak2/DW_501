package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/api/v1/sample")
	public List<String> callData(){
		List<String> list = new ArrayList<>();
		list.add("삼겹살");
		list.add("항정살");
		list.add("목살");
		return list;
	}
	
	@GetMapping("/api/v1/movie")
	public Movie callMovie() {
		Movie movie = new Movie();
		movie.setTitle("Just Friends");
		movie.setYear("1985");
		movie.setRuntime("96 min");
		movie.setGanre("Comidy, Romance");
		return movie;
	}
}
