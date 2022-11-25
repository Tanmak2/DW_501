package cafe.control;

import java.util.Scanner;

import cafe.BO.food_service;
import cafe.main.cafe_main;

public class order implements menu_able {

	@Override
	public boolean menu_active() {
		food_service food = new food_service();
		if(cafe_main.user==null) {
			System.out.println("로그인을 먼저 해주세요");
		}
		else {
			food.order_food(menu());
		}
		return true;
	}
	
	private int menu() {
		String[] mlist = {"안먹고싶음","닭볶음탕","코코볼","보쌈","조개찜","불고기","건빵후레이크","김치국","연어초밥","열라면","순두부찌개","불족발","당당치킨","까르보나","마라탕","부대찌개"};
		
		int i = 1;
		for(String m : mlist) {
			System.out.println(i+". "+m);
			i++;
		}
		System.out.println("선택 : ");
		return new Scanner(System.in).nextInt();
	}
}
