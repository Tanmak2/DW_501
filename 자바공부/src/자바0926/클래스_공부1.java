package 자바0926;

class 붕어빵{
	
	public static String 붕어빵을만들다(String 재료) {
		String out = 재료+ " 붕어빵을 만들었습니다!";
		System.out.println(out);
		return 재료;
	}
	
	public static int 붕어빵수량을파악하다(int 수량) {
		System.out.println("붕어빵은 "+수량+"개 있습니다.");
		return 수량;
	}
	
}


class Pizza{
	
	public static void 피자를먹다() {
		System.out.println("백종원파자 냠냠");
	}
	
	public static String 피자를주문하다(String 피자이름, int 수량) {
		return "불고기피자";
	}
}

public class 클래스_공부1 {

	public static void main(String[] args) {
		
		Pizza p = new Pizza();
		p.피자를먹다();
		
		붕어빵 팥붕어빵 = new 붕어빵();
		팥붕어빵.붕어빵을만들다("팥");
		팥붕어빵.붕어빵수량을파악하다(10);
		
	}

}
