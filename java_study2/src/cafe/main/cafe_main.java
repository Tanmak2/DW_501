package cafe.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import cafe.VO.member;
import cafe.control.event;
import cafe.control.exit;
import cafe.control.login;
import cafe.control.menu_able;
import cafe.control.myInfo;
import cafe.control.order;
import cafe.control.signin;

public class cafe_main {
	static Scanner sc = new Scanner(System.in);
	public static member user = null;

	public static void main(String[] args) {
		
		menu_able[] menu = {new order(), new myInfo(), new event(), new login(), new signin(), new exit()};
		
		while(menu[main_menu() -1].menu_active());
	}
	
	public static int main_menu() {
		int select = 0;
		String[] menu = {"주문","내정보","이벤트","로그인","회원가입","종료"};
		try {
			for(int i=1; i<=menu.length; i++) {
				if(user!=null && (i==4 || i==5)) {
					continue;
				}
				System.out.println(i+". "+menu[i-1]);				
			}
			System.out.print("선택 : ");
			select = sc.nextInt();
			if(select<1 || select>5)
				throw new InputMismatchException("잘못입력했습니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			sc.nextLine();
			select = main_menu();
		}
		return select;
	}
}
