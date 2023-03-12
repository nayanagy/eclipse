package com.xworkz.nayana_xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connObject = DriverManager.getConnection("jdbc:mysql://localhost:3306/bingo","root",
					"Xworkzodc@123");
			String updateQuery = "Update jewellery_table set j_color='silver' where j_id=12";
			Statement statement = connObject.createStatement();
			int rowUpdated = statement.executeUpdate(updateQuery);
			System.out.println("row Updated " + rowUpdated);
		} catch (ClassNotFoundException exception) {
			System.err.println(
					"ClassNotFoundException problem loading driver,class name is wrong" + exception.getMessage());
		} catch (SQLException e) {
			System.err.println(
					"SQLException connecting tp DB,either URL<userName or password is wrong " + e.getMessage());
		}

	}

}
