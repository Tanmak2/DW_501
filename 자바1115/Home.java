package 자바1115;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Home {
	public static void main(String[] args) {
		Emp sawon1 = new Emp("SMITH",160,"CLERK");
		Emp sawon2 = new Emp("ALLEN",1600,"SALESMAN");
		Emp sawon3 = new Emp("WARD",1250,"SALESMAN");
		Emp sawon4 = new Emp("JONES",2975,"MANAGER");
		Emp sawon5 = new Emp("MARTIN",1250,"SALESMAN");
		Emp sawon6 = new Emp("BLAKE",2850,"MANAGER");
		Emp sawon7 = new Emp("CLARK",2450,"MANAGER");
		Emp sawon8 = new Emp("SCOTT",3000,"ANALYST");
		Emp sawon9 = new Emp("KING",5000,"PRESIDENT");
		Emp sawon10 = new Emp("TURNER",1500,"SALESMAN");

		//문제1. arrayList을 생성 후 sawon1 ~ sawon10 add하기!
		List<Emp> list = new ArrayList<Emp>();
		list.add(sawon1);
		list.add(sawon2);
		list.add(sawon3);
		list.add(sawon4);
		list.add(sawon5);
		list.add(sawon6);
		list.add(sawon7);
		list.add(sawon8);
		list.add(sawon9);
		list.add(sawon10);
		
		//문제2. 직원 총 급여 구하기
		int sumSal = 0;
		for(Emp sawon : list) {
			sumSal += sawon.sal;
		}
		System.out.println("직원의 총 급여 : "+sumSal);
		
		//문제3. 직원 평균 급여 구하기
		int avgSal = sumSal/list.size();
		System.out.println("직원의 평균 급여 : "+avgSal);
		
		//문제4. 직업이 MANAGER고 급여가 2500이상받는 사원 수 구하기
		int cnt = 0;
		for(Emp sawon : list) {
			if(sawon.job.equals("MANAGER") && sawon.sal >= 2500) {
				cnt++;
			}
		}
		System.out.println("직업이 MANAGER고 급여가 2500이상 받는 사원 수 : "+cnt);
		
		//문제5. 가장 급여를 많이 받는 사원의 이름과 직업 조회하기
		String maxName = "";
		int maxSal = 0;
		String maxJob = "";
		for(Emp sawon : list) {
			if(sawon.sal > maxSal) {
				maxName = sawon.ename;
				maxSal = sawon.sal;
				maxJob = sawon.job;
			}
		}
		
		System.out.println("가장 급여를 많이 받는 사원의 이름 : "+maxName);
		System.out.println("가장 급여를 많이 받는 사원의 직업 : "+maxJob);
		
	}
}
