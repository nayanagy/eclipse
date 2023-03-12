package com.xworkz.nayana_xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDelete {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connObject = DriverManager.getConnection("jdbc:mysql://localhost:3306/bingo","root",
					"Xworkzodc@123");
			String deleteQuery = "Delete from jewellery_table where j_id=14";
			Statement statement = connObject.createStatement();
			int rowDeleted = statement.executeUpdate(deleteQuery);
			System.out.println("row Deleted " + rowDeleted);
		} catch (ClassNotFoundException exception) {
			System.err.println(
					"ClassNotFoundException problem loading driver,class name is wrong" + exception.getMessage());
		} catch (SQLException e) {
			System.err.println(
					"SQLException connecting tp DB,either URL<userName or password is wrong " + e.getMessage());
		}
	
	}

}
