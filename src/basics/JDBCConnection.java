package basics;

import java.sql.*;

public class JDBCConnection {
	private static String driverName = "com.mysql.cj.jdbc.Driver";
	private static String password = "ab_automation";
	private static String url = "jdbc:mysql://localhost:3306/ab_automation2401";
	private static String username = "ab_automation";

	public static void main(String[] args) {

		String query = "select S_No,DataBase_pwd from dba_input where S_No = 1";
		try {
			Class.forName(driverName); // Driver name
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established successfully");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query); // Execute query
			if (rs.next()) {
				String DataBase_pwd = rs.getString("DataBase_pwd"); // Retrieve name from db
				System.out.println(DataBase_pwd); // Print result on console
			}
			st.close(); // close statement
			con.close(); // close connection
			System.out.println("Connection Closed....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
