package cafe.BO;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

import cafe.DAO.food_DAO;
import cafe.DAO.member_DAO;
import cafe.VO.member;
import cafe.VO.order_list;
import cafe.main.cafe_main;

public class myinfo_service {
	
	private member_DAO mdao = new member_DAO();
	private food_DAO fdao = new food_DAO();
	
	public void info() {
		DecimalFormat fmt = new DecimalFormat("###,###");
		member my = cafe_main.user;
		System.out.println("아이디 : "+my.getId());
		System.out.println("이름 : "+my.getName());
		System.out.println("연락처 : "+my.getTel());
		System.out.println("이메일 : "+my.getEmail());
		System.out.println("알러지 : "+my.getAllergy());
		System.out.println("잔액 : "+fmt.format(my.getMoney())+"원");
	}
	
	public void order_list() {
		List<order_list> list = fdao.order_select(cafe_main.user.getId());
		
		Iterator<order_list> it = list.iterator();
		
		while(it.hasNext()) {
			order_list data = it.next();
			System.out.println("주문음식 : "+data.getFood_name());
			System.out.println("주문자 : "+data.getAn_order());
			System.out.println("주문금액 : "+data.getPrice());
			String state = data.getDelivery_complete()==0?"배달중":"배달완료";
			System.out.println("배달상태 : "+state);
			System.out.println("요청사항 : "+data.getMemo());
		}
		
	}
	
	public void my_wallet() {
		
	}
	
}
