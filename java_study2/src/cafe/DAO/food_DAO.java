package cafe.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cafe.VO.food;
import cafe.VO.order_list;

public class food_DAO extends base_DAO{
	
	public List<order_list> order_select(String id){
		List<order_list> list = new ArrayList<>();
		
		String sql="select * from order_list where an_order=?";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			rs = pt.executeQuery();
			while(rs.next()) {
				order_list data = new order_list(rs.getInt("order_seq"), rs.getString("food_name"), rs.getString("an_order"), rs.getInt("order_price"), rs.getInt("delivery_complete"), rs.getString("memo"));
				list.add(data);		
			}
			return list;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
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

	public void order_insert(order_list cont) {
		String sql="insert into order_list(food_name,an_order,order_price,memo) values(?,?,?,?)";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, cont.getFood_name());
			pt.setString(2, cont.getAn_order());
			pt.setInt(3, cont.getPrice());
			pt.setString(4, cont.getMemo());
			pt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
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
