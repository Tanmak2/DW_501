package 자바0927;

public class 영화관 {
	private int 직원수;
	private String 영화관위치;
	private String 영화관이름;
	private String[] 개봉영화종류;
	private String 영화관정보;
	
	public void set직원수(int 직원수) {
		this.직원수 = 직원수;
	}
	
	public int get직원수() {
		return 직원수;
	}
	
	public void set영화관위치(String 영화관위치) {
		this.영화관위치 = 영화관위치;
	}
	
	public String get영화관위치() {
		return 영화관위치;
	}
	
	public void set영화관이름(String 영화관이름) {
		this.영화관이름 = 영화관이름;
	}
	
	public String get영화관이름() {
		return 영화관이름;
	}
	
	public void 개봉영화종류찾자(String[] x) {
		개봉영화종류 = x;
	}
	
	public String[] 개봉영화종류리턴() {
		return 개봉영화종류;
	}
}
