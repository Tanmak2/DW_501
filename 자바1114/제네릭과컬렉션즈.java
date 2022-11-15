package 자바1114;

import java.util.ArrayList;
import java.util.List;

public class 제네릭과컬렉션즈 {

	public static void main(String[] args) {
		int[] array = {5,7,6,10};
		int[] array2 = new int[4];
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		
		System.out.println("0번째 값 : "+list.get(0));
		System.out.println("1번째 값 : "+list.get(1));
		
		System.out.println(list.size());
		list.remove(1);
		System.out.println(list.size());
		
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(5);
		numberList.add(7);
		numberList.add(13);
		numberList.add(15);
		
		for(int i=0; i<numberList.size(); i++) {
			if(numberList.get(i) % 5 == 0) {
				System.out.println(numberList.get(i));
			}
		}
		
		for(int i : numberList) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
		}
		numberList = new ArrayList<Integer>();
		numberList.add(50);
		numberList.add(100);
		numberList.add(300);
		numberList.add(99);
		int sum = 0;
		int cnt = 0;
		
		for(int i : numberList) {
			sum += i;
			if(i >= 100) {
				cnt++;
			}
		}
		
		System.out.println(sum+","+cnt);
		
		
		List<String> wordList = new ArrayList<String>();
		wordList.add("아이스아메리카노");
		wordList.add("카페라떼");
		wordList.add("카페모카");
		wordList.add("아이스아메리카노");
		wordList.add("아이스아메리카노");
		wordList.add("아이스아메리카노");
		
		cnt = 0;
		
		for(String item : wordList) {
			if(item.equals("아이스아메리카노")) {
				cnt++;
			}
		}
		
		System.out.println("아이스아메리카노는 "+cnt+"개 있습니다.");
		
		버거킹 골드와퍼 = new 버거킹();
		골드와퍼.버거종류 = "치즈버거종류";
		골드와퍼.버거가격 = 9000;
		버거킹 와퍼 = new 버거킹();
		와퍼.버거종류 = "불고기버거종류";
		와퍼.버거가격 = 8000;
		
		List<버거킹> 버거킹선화점 = new ArrayList<버거킹>();
		버거킹선화점.add(골드와퍼);
		버거킹선화점.add(와퍼);
		
		for(버거킹 버거 : 버거킹선화점) {
			System.out.println(버거.버거종류);
			System.out.println(버거.버거가격);
		}

	}

}
