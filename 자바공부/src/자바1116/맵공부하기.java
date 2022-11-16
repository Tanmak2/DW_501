package 자바1116;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 맵공부하기 {

	public static void main(String[] args) {
		
		//Map : Key와 value의 쌍으로 값을 저장하는 컬렉션즈 중에 하나
		
		Map<String, Integer> x = new HashMap<String, Integer>();
		
		x.put("one", 1);
		x.put("two", 2);
		x.put("three", 3);
		
		System.out.println(x.get("one"));
		
		//자바의 모든 클래스는 디폴트로 Object를 상속 받고 있다.
		Map<String, Object> map = new HashMap<>();
		
		map.put("empno", 7844);
		map.put("ename", "TURNER");
		map.put("job", "SALESMAN");
		map.put("sal", 1500);
		map.put("empno", 7839);
		
		//empno하고 sal을 출력하기
		
		System.out.println(map.get("empno"));
		System.out.println(map.get("sal"));
		
		List<Map<String, Object>> list = new ArrayList<>();
		list.add(map);
		
	}

}
