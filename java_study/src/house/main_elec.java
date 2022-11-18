package house;

import java.util.List;

public class main_elec {

	static List<house_item> list = null;
	
	public static void init(){
		file f = new file("c:/test/electronic.txt");
		
		list = f.load();
	}
	
	public static void main(String[] args) {
		init();
		
		for(house_item item : list) {
			System.out.println(item.toString());
		}
	}

}
