package org.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlLaunch {

	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection;
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "venk@93");
			
			String query = "select * from employees";
			
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet executequery=statement.executeQuery();
			
			while(executequery.next()) {
				String string = executequery.getString("first_name");
				System.out.println(string);
			}
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
