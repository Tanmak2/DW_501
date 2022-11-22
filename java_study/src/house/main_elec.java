package house;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main_elec {

	static List<house_item> list = null;
	
	public static void init(){
		file f = new file("c:/test/electronic.txt");
		
		list = f.load();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		init();
		buyer jyj = new buyer();
		while(true) {
			System.out.print("1.tv 2.에어컨 3.컴퓨터 선택해주세요");
			int select = sc.nextInt();
			int i = 1;
			List<Integer> num = new ArrayList<>();
			for(house_item item : list) {
				switch(select) {
				case 1:
					if(item instanceof tv) {
						System.out.println(i+". "+item.toString());
						num.add(i);
					}
					break;
				case 2:
					if(item instanceof aircon) {
						System.out.println(i+". "+item.toString());
						num.add(i);
					}
					break;
				case 3:
					if(item instanceof computer) {
						System.out.println(i+". "+item.toString());
						num.add(i);
					}
					break;
				}
				i++;
			}
			while(true) {
				System.out.println("구매 할 제품 선택(구매 x 0) : ");
				int item_num = sc.nextInt();
				if(num.indexOf(item_num) != -1) {
					jyj.buy(list.get(item_num-1));
					break;
				}
				else if(item_num == 0) {
					break;
				}
				else {
					System.out.println("제품번호가 잘못되었습니다.");
					continue;
				}
			}
			System.out.println("추가로 구매하시겠습니까? 1.추가 구매 2.구매 중지");
			int add_num = sc.nextInt();
			if(add_num == 1) continue;
			else {
				break;
			}
		}
		for(house_item item : jyj.getBuy_list()) {
			System.out.println(item.toString());
		}
		
	}
}
