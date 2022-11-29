package cafe.control;

import java.util.Scanner;

import cafe.BO.myinfo_service;
import cafe.main.cafe_main;

public class myInfo implements menu_able {
	
	private myinfo_service mysvc = new myinfo_service();
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public boolean menu_active() {
		if(cafe_main.user==null) {
			System.out.printf("로그인 먼저 해주세요%n========================%n%n");
			return true;
		}
		System.out.print("1. 내정보  2. 주문내역  3. 내지갑 : ");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			mysvc.info();
			break;
		case 2:
			mysvc.order_list();
			break;
		case 3:
			mysvc.my_wallet();
			break;
		}
		return true;
	}
}
