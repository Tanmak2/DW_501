package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
		movie.setYear("2005");
		movie.setRuntime("96 min");
		movie.setGanre("Comedy, Romance");
		return movie;
	}
	
	@GetMapping("/api/v1/movies")
	public List<Movie> callMovies(){
		List<Movie> list = new ArrayList<>();
		Movie movie = new Movie();
		movie.setTitle("Just Friends");
		movie.setYear("2005");
		movie.setRuntime("96 min");
		movie.setGanre("Comedy, Romance");
		
		Movie movie2 = new Movie();
		movie2.setTitle("Just Friends");
		movie2.setYear("2005");
		movie2.setRuntime("96 min");
		movie2.setGanre("Comedy, Romance");
		
		list.add(movie);
		list.add(movie2);
		
		return list;
	}
	
	@GetMapping("/api/v1/sports/qatar2022/article/{articleNumber}")
	public int callAtricle(@PathVariable int articleNumber) {
		return articleNumber;
	}
	
//	@GetMapping("/api/v1/webtoon/list")
//	public Map<String, Object> callWebtoon(@RequestParam int titleId, String weekday){
//		Map<String, Object> map = new HashMap<>();
//		map.put("titleId", titleId);
//		map.put("weekday", weekday);
//		
//		
//		return map;
//	}
	@GetMapping("/api/v1/webtoon/list/titleId/{titleId}/weekday/{weekday}")
	public Map<String, Object> callWebtoon(@PathVariable int titleId, @PathVariable String weekday){
		Map<String, Object> map = new HashMap<>();
		map.put("titleId", titleId);
		map.put("weekday", weekday);
		return map;
	}
	
}
