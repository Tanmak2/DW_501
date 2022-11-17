package house;

public class main_house {

	public static void main(String[] args) {
		
		house_item[] t = new tv[]{new tv("삼성", 1230000, 65),new tv("LG", 1505000, 65),new tv("삼성", 890000, 55),new tv("LG", 2240000, 75),new tv("삼성", 730000, 50)};
		house_item[] air = new aircon[]{new aircon("휘센", 1510510, 17),new aircon("캐리어", 1619800, 25),new aircon("휘센", 1587110, 30),new aircon("위니아", 189000, 17),new aircon("비스포크", 1878590, 19)};
		
		t[0].buy();
		air[1].buy();
		
//		tv t = new tv("삼성", 1230000);
//		tv t2 = new tv("LG", 985000);
//		
//		aircon air1 = new aircon("휘센", 940000);
//		aircon air2 = new aircon("위니아", 560000);
//		
//		computer com1 = new computer("정수PC", 1520000);
//		
//		System.out.println(t.toString());
//		System.out.println(t2.toString());
//		System.out.println(air1.toString());
//		System.out.println(air2.toString());
//		System.out.println(com1.toString());
		
		
		//		tv t = new tv();
//		aircon air = new aircon();
//		computer com = new computer();
//		
//		air.brand="휘센";
//		air.price=1200000;
//		System.out.println(air.brand);
//		System.out.println(t.onoff);
//		
//		t.power();
//		t.power();
//		air.power();

	}

}
/*
 * 클래스 관계 - 상속, 포함
 * 상속 - 부모자식 관계
 * 부모클래스 - 자식1클래스
 * 			 - 자식2클래스
 * 			 - 자식3클래스
 * <div>
 * 		<div>
 * 			<img>
 * 			<input>
 * 		</div>
 * </div>
 * 
 * 
 */