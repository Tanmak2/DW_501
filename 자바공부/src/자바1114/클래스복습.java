package 자바1114;

class 월드컵{
	String 출전국가;
	String 선수명단;
	String 개최지;
	
	월드컵(String 출전국가, String 선수명단, String 개최지){
		this.출전국가 = 출전국가;
		this.선수명단 = 선수명단;
		this.개최지 = 개최지;
	}
	
	String 출전국가알아내기() {
		return "우루과이";
	}
	
	String 개최지알아내기() {
		return this.개최지;
	}
	
	String 선수명단알아내기() {
		return this.선수명단;
	}
	
}

public class 클래스복습 {
	public static void main(String[] args) {
		월드컵 a = new 월드컵("프랑스","디디에 데샹 외 몇명","카타르");
		
		System.out.println(a.개최지);
		System.out.println(a.선수명단);
		System.out.println(a.출전국가);
		a.개최지 = "카타르";
		a.선수명단 = "대한민국 선수단";
		a.출전국가 = "대한민국";
		
		a.출전국가알아내기();
	}
}
