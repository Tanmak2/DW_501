package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class init_DAO {
	protected Connection conn=null;
	protected Statement st=null;
	protected PreparedStatement pt=null;
	protected ResultSet rs=null;
	
	protected init_DAO() {
		DriverLoad();
		Connect();
	}
	
	private void DriverLoad() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void Connect() {
		String url="jdbc:mysql://localhost:3306/dw_501";
		String user = "root";
		String pass = "toor";
		try {
			conn = DriverManager.getConnection(url, user, pass);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
