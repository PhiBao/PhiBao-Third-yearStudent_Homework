package ConnectDB;

import java.sql.*;

public class Connect2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/DATA";
			Connection conn = DriverManager.getConnection(url, "root", "");
			Statement sttm = conn.createStatement();
			String sql = "SELECT * FROM TABLE1";
			ResultSet rs = sttm.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int numCol = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= numCol; i++) {
					System.out.print(rsmd.getColumnLabel(i) + ": ");
					System.out.print(rs.getObject(i) + "\n");
				}
				System.out.println();
			}
			rs.close();
			sttm.close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
