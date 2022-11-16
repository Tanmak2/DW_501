package 자바1115;

import java.util.ArrayList;
import java.util.List;

class Student{
	String name;
	String height;
	//문제1. 필드변수에 값을 초기화할 수 있는 생정자 만들기
	
	Student(String name, String height){
		this.name = name;
		this.height = height;
	}
	
	void print() {
		System.out.println("이름 : "+name+", 키 : "+height);
	}
}

public class 오늘수업1115 {

	public static void main(String[] args) {
		
		//문제2. 학생 클래스 3개 만들어서 아래 값 출력하기
		//이름 : 홍길동, 키 : 179
		//이름 : 김길동, 키 : 185
		//이름 : 이길동, 키 : 172
		Student s1 = new Student("홍길동", "179");
		Student s2 = new Student("김길동", "185");
		Student s3 = new Student("이길동", "172");
		s1.print();
		s2.print();
		s3.print();
		
		
		//문제3. 학생클래스 ArrayList에 add하기
		List<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
	}

}
