package cafe.DAO;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import cafe.VO.food;

public class food_DAO extends base_DAO{
	
	
	public Map<Integer,food> food_list() {
		
		Map<Integer,food> food_map = new HashMap<>();
		
		String sql="select * from food";
		
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			while(rs.next()) {
				food data = new food(rs.getInt("food_seq"), rs.getString("food_name"), rs.getInt("cost"), rs.getInt("cook_time"), rs.getInt("cal"),rs.getString("allergy"), rs.getInt("order_quantity"));
				food_map.put(data.getFood_seq(), data);
			}
			return food_map;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}


/*
 * 자바 컬렉션
 * Cpllection (인터페이스)
 * 1. List
 * 		1). ArrayList
 * 		2). LinkedList
 *		3). vector
 *		4). stack
 *		5). queue
 *
 * 2. Set
 * 		1). HashSet
 * 		2). TreeSet
 * 
 * Map
 * 		1. HashMap
 * 		2. HashTable
 * 		3. TreeMapp
 * 		4. Properties
 *
 */
