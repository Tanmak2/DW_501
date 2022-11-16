package test1;

public class study3 {

	public static void main(String[] args) {
		// 이름, 연락처, 주소, 생년월일, 성별, 아이디
		// 회원정보 저장하기
		
		member m1 = new member();
		
		m1.성별="여자";
		m1.아이디="limit";
		m1.이름="이순자";
		m1.주소="대전 중구 선화동";
		
		member m2 = new member();
		
		m2.성별="남자";
		m2.아이디="eternal";
		m2.이름="장보고";
		m2.주소="대전 동구 가양동";
		
		output(m1);
		output(m2);
		m1.output();
		m2.output();
	}
	
	static void output(member m) {
		System.out.println("성별 : "+m.성별+" 아이디 : "+m.아이디+" 이름 : "+m.이름+" 주소 : "+m.주소);
	}

}
