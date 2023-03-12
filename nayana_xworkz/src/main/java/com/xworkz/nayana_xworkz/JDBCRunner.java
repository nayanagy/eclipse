package com.xworkz.nayana_xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connObject = DriverManager.getConnection("jdbc:mysql://localhost:3306/bingo","root",
					"Xworkzodc@123");
			String insertQuery = "insert into jewellery_table values(12,'Shashank',2000,'gold','ring',8)";
			Statement statement = connObject.createStatement();
			int rowAffected = statement.executeUpdate(insertQuery);
			System.out.println("row affected " + rowAffected);
		} catch (ClassNotFoundException exception) {
			System.err.println(
					"ClassNotFoundException problem loading driver,class name is wrong" + exception.getMessage());
		} catch (SQLException e) {
			System.err.println(
					"SQLException connecting tp DB,either URL<userName or password is wrong " + e.getMessage());
		}
	}

}
