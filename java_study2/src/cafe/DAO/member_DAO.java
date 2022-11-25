package cafe.DAO;

import java.sql.SQLException;

import cafe.VO.member;
import cafe.main.cafe_main;

public class member_DAO extends base_DAO{
	
	public member_DAO() {
		table_check();
	}
	public boolean member_insert(String id, String name, String tel, String email) {
		String sql="insert into member(id,name,tel,email) values(?,?,?,?)";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, name);
			pt.setString(3, tel);
			pt.setString(4, email);
			pt.executeUpdate();
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	private void table_check() {
		String sql="select COUNT(*) as cnt from information_schema.tables where table_schema='dw_501' and table_name='member'";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				int cnt = rs.getInt("cnt");
				if(cnt == 0)
					tablemake();
			}
			rs.close();
			st.close();
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("쿼리 오류");
		}
		
	}
	private void tablemake() {
		String sql="create table member( member_seq int auto_increment primary key,"
				+ "id varchar(50) not null, name varchar(20) not null,"
				+ "tel varchar(20) not null, email varchar(255) not null)";
		
		try {
			st = conn.createStatement();
			int result = st.executeUpdate(sql);
			System.out.println("member 테이블 생성");
			
		}catch(SQLException e) {
			
		}
		
	}
	public boolean id_check(String id, String email) {
		String sql = "select id, email from member where id=? OR email=?";
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, email);
			rs = pt.executeQuery();
			if(rs.next()) {
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	public boolean login(String id, String pw) {
		String sql = "select * from member where id=? AND tel=?";
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, pw);
			rs = pt.executeQuery();
			if(rs.next()) {
				cafe_main.user = new member(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getShort(5));
				return false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean tel_check(String tel) {
		if(tel.substring(0, 3).equals("010") && tel.length() == 11){
			return true;
		}
		return false;
	}
	public boolean email_check(String email) {
		String[] emails=null;
		if(email.indexOf("@") != -1) {
			emails = email.split("@");
			String[] add = emails[1].split(".");
			for(String i : emails) {
				System.out.println(i);
				System.out.println(i.equals(""));
			}
			System.out.println(add);
		}
		else {
			return false;
		}
		if(emails[0].equals("") || emails[1].split(".")[0].equals("") || emails[1].split(".")[1].equals("")) {
			return false;			
		}
		else {
			return true;
		}
	}
}