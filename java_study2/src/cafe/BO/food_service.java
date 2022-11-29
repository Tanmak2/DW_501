package cafe.BO;

import java.util.Map;
import java.util.Scanner;

import cafe.DAO.food_DAO;
import cafe.VO.food;
import cafe.VO.order_list;
import cafe.main.cafe_main;

public class food_service {
	private food_DAO fdao = new food_DAO();
	private Scanner sc = new Scanner(System.in);

	public boolean order_food(int seq) {
		Map<Integer,food> map = fdao.food_list();
		if(map!=null) {
			food my_Order = map.get(seq);
			System.out.println("주문 음식 : " + my_Order.getFood_name());
			System.out.println("조리시간 : " + my_Order.getCook_time());
			System.out.println("금액 : " + my_Order.getCost()+"원");
			System.out.println("알러지 : " + my_Order.getAllergy());
			
			String[] tmp = cafe_main.user.getAllergy().split(",");
			
			for(String all : tmp) {
				if(my_Order.getAllergy().contains(all) && !(tmp.equals("x"))) {
					System.out.println("주문하신 음식은 알레르기 유발 음식입니다.");
					System.out.print("계속 주문하시겠습니까?(y/n) : ");
					if(sc.nextLine().equals("n") ) {
						return true;
					}
					break;
				}
			}
			System.out.print("주문 요청사항 : ");
			String memo = sc.nextLine();
			order_list cont = new order_list(my_Order.getFood_name(), cafe_main.user.getId(), my_Order.getCost(), memo);
			fdao.order_insert(cont);
			
		}
		else {
			System.out.println("관리자에게 문의 하세요");
			return true;
		}
		return false;
	}
}
