package dao;

import java.sql.*;

import database.DbConnection;

class FetchRecord {
	public static void main(String args[]) throws Exception {

		Class.forName(DbConnection.driverName);
		Connection con = DriverManager.getConnection(DbConnection.connectionURL, DbConnection.userName,
				DbConnection.password);
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery("select * from employee");

		rs.absolute(2);
		System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));

		rs.relative(-1);
		System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));

		System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		con.close();
	}
}
