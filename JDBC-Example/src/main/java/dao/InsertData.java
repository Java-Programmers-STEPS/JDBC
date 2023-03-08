package dao;

import java.sql.*;

import database.DbConnection;

public class InsertData {

	public static void main(String args[]) throws Exception {
		Class.forName(DbConnection.driverName);
		Connection con = DriverManager.getConnection(DbConnection.connectionURL, DbConnection.userName,
				DbConnection.password);
		Statement stmt = con.createStatement();

		int result = stmt.executeUpdate("insert into employee values(103,'Irfan',35)");
		System.out.println(result + " records affected");
		con.close();
	}
}
