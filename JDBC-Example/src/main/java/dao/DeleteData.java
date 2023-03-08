package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import database.DbConnection;

public class DeleteData {
	public static void main(String args[])throws Exception{  
		Class.forName(DbConnection.driverName);
		Connection con = DriverManager.getConnection(DbConnection.connectionURL, DbConnection.userName,
				DbConnection.password); 
	Statement stmt=con.createStatement();  
	  
	int result=stmt.executeUpdate("delete from employee where id=102");  
	System.out.println(result+" records affected");  
	con.close();  
	}
}
