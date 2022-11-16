package 자바0913;

public class 자바기초 {

	public static void main(String[] args) {
		
		//자바 공부 주의점
		//1. 당분간 코딩은 main {}안에 한다. (메소드 수업 전 까지)
		//2. 실행하는 방법은 ctrl + F11을 동시에 누른다.
		
		//자바 변수 선언
		//자바는 엄격한 타입언어이다.
		
		int 돈 = 100; //데이터가 숫자면 int!
		//int : 데이터 타입
		// x : 변수 이름 (자바는 한글지원 가능)
		// = : 대입 연산자
		// 100 : 데이터
		돈 = 50; //대입연산자가 아래 또 나오면 기존에 100은 없어진다.
		//최종 돈 값은? => 50
		int 고기 = 10;
		고기 = 5;
		고기 = 1;
		고기 = 고기 + 3;
		고기 = 고기 +고기;
		
		int 초밥 = 5;
		초밥 = 초밥 * 2;
		초밥 = 초밥 / 2;
		
		int 내지갑 = 50000;
		int 만원몇장 = 0;
		만원몇장 = 내지갑 / 10000;
		System.out.println(만원몇장);
		
		int 국어 = 80;
		int 수학 = 15;
		int 영어 = 65;
		int 평균 = 0;
		평균 = (국어 + 수학 + 영어) / 3;
		
		System.out.println("평균 점수는 => "+평균);
		
		// 자바 데이터 타입 종류
		// short, byte : 숫자
		// int : 숫자 ***
		// long : 숫자 ***
		// float : 숫자 (소수)
		// double : 숫자 (소수)
		// char : 문자
		// String : 문자 *** => 클래스 타입
		// boolean : true, false ***
		
		String 이름 = "홍길동";
		이름 = 이름 + "철수";
		System.out.println("이름은 => "+이름);
		
		//문자를 숫자로 변환
		String num = "10";
		int num2 = 0;
		num2 = Integer.parseInt(num);
		System.out.println("문자에서 숫자로 변환된 값은 "+num2);
		
		
	}

}
