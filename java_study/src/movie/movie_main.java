package movie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

public class movie_main {

	public static void main(String[] args) {
		
		List<movieVo> list = new ArrayList<>();
		
		String path = "c:/test/movie.txt";
		
		try(BufferedReader file = new BufferedReader(new FileReader(path))) {
			while(true) {
				String line = file.readLine();
				if(line == null) break;
				String[] temp = line.split(" ");
				movieVo data = new movieVo(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
				list.add(data);	
			}
		}catch(Exception e) {
			System.out.println("파일 없다");
		}

		for(movieVo movie : list) {
			System.out.println(movie.toString());
		}
		
		
		
		
		
		//		Scanner sc = new Scanner(System.in);
//		List<movieVo> movieList = new ArrayList<movieVo>();
//		movieVo m1 = new movieVo("블랙팬서","2022","12세이상 관람가");
//		movieVo m2 = new movieVo("데시벨","2022","12세이상 관람가");
//		movieVo m3 = new movieVo("동감","2022","12세이상 관람가");
//		movieVo m4 = new movieVo("압꾸정","2022","12세이상 관람가");
//		
//		m1.print();
//		m2.print();
//		m3.print();
//		m4.print();
		
//		for(int i=0; i<4; i++) {
//			System.out.print("영화제목 : ");
//			String movieTitle = sc.nextLine();
//			System.out.print("개봉연도 : ");
//			String movieYear = sc.nextLine();
//			System.out.print("관람등급 : ");
//			String movieGrade = sc.nextLine();
//			movieVo m = new movieVo(movieTitle, movieYear, movieGrade);
//			movieList.add(m);
//		}
//		for(movieVo movie : movieList) {
//			movie.print();
//		}
		
	}

}
