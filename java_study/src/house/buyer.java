package house;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class buyer {
	private int money = 10000000;
	private String name = "장영주"; // 명시적 초기화
	private String special_note = "발 부상";
	private List<house_item> buy_list = null;
	
	{
		special_note = "목발 하나만 필요";
	}
	
	public buyer() {
		buy_list = new ArrayList<>();
		special_note = "두발로걸어다님";
	}
	
	public void buy(house_item item) {
		if(money < item.price) {
			System.out.println("돈이 부족합니다. 목발을 팔아주세요");
			return;
		}
		buy_list.add(item);
		money -= item.price;
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("현재 잔액 : "+df.format(money)+"원");
	}

	public List<house_item> getBuy_list() {
		return buy_list;
	}

	public void setBuy_list(List<house_item> buy_list) {
		this.buy_list = buy_list;
	}
}
