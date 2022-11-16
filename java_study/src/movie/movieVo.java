package movie;

public class movieVo {
	private String movieTitle;
	private int movieYear;
	private int movieGrade;
	
	public movieVo(String movieTitle, int movieYear, int movieGrade) {
		this.movieTitle = movieTitle;
		this.movieYear = movieYear;
		this.movieGrade = movieGrade;
	}
	
	@Override
	public String toString() {
		return "영화제목 : "+movieTitle+" 개봉년도 : "+movieYear+" 관람등급 : "+movieGrade+"세이상";
	}
	
	public String getMovieTitle() {
		return movieTitle;
	}
	
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public int getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}

	public int getMovieGrade() {
		return movieGrade;
	}

	public void setMovieGrade(int movieGrade) {
		this.movieGrade = movieGrade;
	}

	public void print() {
		System.out.println("영화제목 : "+movieTitle+" 개봉년도 : "+movieYear+" 관람등급 : "+movieGrade+"세이상");
	}
	
}
