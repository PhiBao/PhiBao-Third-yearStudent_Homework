package ConnectDB;

import java.sql.*;

public class Connect1 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		System.out.println("Kết nối CSDL");
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url = "jdbc:odbc:Data";
			Connection conn = DriverManager.getConnection(url);
			Statement sttm = conn.createStatement();
			String sql = "SELECT * FROM TABLE1";
			ResultSet rs = sttm.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("ID");
				String n = rs.getString("Name");
				String ad = rs.getString("Address");
				int tt = rs.getInt("Total");
				System.out.println("ID = " + id + "\n" + " Name =  " + n + "\n" + " Address = " + ad + "\n"
						+ " Total = " + tt + "\n");
			}
			conn.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
