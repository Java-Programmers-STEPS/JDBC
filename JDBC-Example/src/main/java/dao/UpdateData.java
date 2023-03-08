package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import database.DbConnection;

public class UpdateData {
	public static void main(String args[])throws Exception{  
		Class.forName(DbConnection.driverName);
		Connection con = DriverManager.getConnection(DbConnection.connectionURL, DbConnection.userName,
				DbConnection.password); 
	Statement stmt=con.createStatement();  
	  
	int result=stmt.executeUpdate("update employee set name='Vimal',age=40 where id=101");  
	System.out.println(result+" records affected");  
	con.close();  
	}
}
