package command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import DAO.venture_DAO;
import VO.venture;

public class main_cmd {
	private static venture_DAO vdao = new venture_DAO();
	
	public static void main(String[] args) {
		List<venture> list = vdao.Select_all();
		
		TreeSet<venture> sw = new TreeSet<>();
		TreeSet<venture> build = new TreeSet<>();
		
		Iterator<venture> it = list.iterator();
		while(it.hasNext()) {
			venture temp = it.next();
			if(temp.getCategory().contains("정보처리"))
				sw.add(temp);
			if(temp.getCategory().contains("건설"))
				build.add(temp);
		}
		System.out.println(sw);
		
		List<venture> sw_list = new ArrayList<>(sw);
		System.out.println(sw.floor(sw_list.get(5)));
		System.out.println(sw.headSet(sw_list.get(3)));
		System.out.println(sw.lower(sw_list.get(10)));
		System.out.println(sw.subSet(sw_list.get(10), sw_list.get(4)));
		
		venture srh = new venture();
		srh.setCompany("(주)골나");
		sw.add(srh);
		System.out.println(sw.headSet(srh));
		
		
		
/*
		Set<String> category = new HashSet<>();
		
		Iterator<venture> it = list.iterator();
		while(it.hasNext()) {
			category.add(it.next().getCategory());
		}
		
		Set<venture> retail = new HashSet<>();
		Set<venture> sw = new HashSet<>();
		Set<venture> build = new HashSet<>();
		
		it = list.iterator();
		while(it.hasNext()) {
			venture data = it.next();
			if(data.getCategory().contains("도소매업")) {
				retail.add(data);
			}
			if(data.getCategory().contains("정보처리")) {
				sw.add(data);
			}
			if(data.getCategory().contains("건설")) {
				build.add(data);
			}
		}
		Set<venture> cha = new HashSet<>();
		Set<venture> gyo = new HashSet<>();
		
		Iterator<venture> gp = sw.iterator();
		
		while(gp.hasNext()) {
			venture temp = gp.next();
			if(retail.contains(temp))
				continue;
			cha.add(temp);
		}
		List<venture> cha_list = new ArrayList<>(cha);
		for(venture tmp : cha_list)
			System.out.println(tmp);
		
		gp = sw.iterator();
		while(gp.hasNext()) {
			venture temp=gp.next();
			if(sw.contains(temp)) {
				gyo.add(temp);
			}
		}
		List<venture> gyo_list = new ArrayList<>(gyo);
		for(venture tmp : gyo_list)
			System.out.println(gyo);
*/
		
/*
		Set<String> name1 = new HashSet<>();
		Set<String> name2 = new HashSet<>();
		
		name1.add("김유신"); 	name1.add("이순신");		name1.add("김춘추");
		name1.add("장영주");		name1.add("김기원");		name1.add("윤재영");
		name1.add("이지현");		name1.add("미지연");		name1.add("최윤도");
		
		name2.add("김민정");		name2.add("김민서");		name2.add("김춘추");
		name2.add("장영주");		name2.add("이종빈");		name2.add("윤재영");
		name2.add("이지현");		name2.add("변크리스탈");		name2.add("리정수");
		
		Set<String> hab = new HashSet<>();
		Set<String> cha = new HashSet<>();
		Set<String> gyo = new HashSet<>();
		
		Iterator<String> test = name1.iterator();
		while(test.hasNext()) {
			hab.add(test.next());
		}
		test = name2.iterator();
		while(test.hasNext()) {
			String name=test.next();
			if(hab.contains(name)) {
				continue;
			}
			hab.add(name);
		}
		
		System.out.println(hab);
		
		test = name2.iterator();
		while(test.hasNext()) {
			String name=test.next();
			if(name1.contains(name)) {
				gyo.add(name);
			}
		}
		
		System.out.println(gyo);
		
		test = name2.iterator();
		while(test.hasNext()) {
			String name=test.next();
			if(name1.contains(name)) {
				continue;
			}
			cha.add(name);
		}
		
		System.out.println(cha);
 */
	}
}
