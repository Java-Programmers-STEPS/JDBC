package dao;

import java.sql.*;

import database.DbConnection;

public class ViewAllRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName(DbConnection.driverName);
			Connection con = DriverManager.getConnection(DbConnection.connectionURL, DbConnection.userName,
					DbConnection.password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
