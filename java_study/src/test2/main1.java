package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test1.member;

public class main1 {

	public static void main(String[] args) {
		
		List<member> list = new ArrayList<>();
		
		list.add(new member());
		list.get(0).성별="남자";
		list.get(0).아이디="end";

		member[] arr = new member[5];
		
//		arr[0] = new member();
//		arr[0].아이디 = "li";
//		arr[0].성별 = "여자";
//		arr[0].이름 = "윤재영";
//		arr[0].주소 = "대전 서구 둔산동";
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new member();
			System.out.print("아이디 : ");
			arr[i].아이디 = sc.nextLine();
			System.out.print("이름 : ");
			arr[i].이름 = sc.nextLine();
			System.out.print("성별 : ");
			arr[i].성별 = sc.nextLine();
			System.out.print("주소 : ");
			arr[i].주소 = sc.nextLine();
		}
		
		for(member temp : arr) {
			temp.output();
		}
	}

}
