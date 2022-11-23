package cafe.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class member_DAO {
	private Connection conn=null;
	private Statement st=null;
	private PreparedStatement pt=null;
	private ResultSet rs=null;
	
	public member_DAO() {
		DriverLoad();
		connect();
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
	private void connect() {
		String url="jdbc:mysql://localhost:3306/dw_501";
		String user = "root";
		String pass = "toor";
		try {
			conn = DriverManager.getConnection(url, user, pass);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("접속 실패");
		}
	}
	private void DriverLoad() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
		}
	}
}