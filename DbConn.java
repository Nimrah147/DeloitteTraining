package com.registertask.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConn {

public static Connection getConn() //signature is important
{

	try
	{

		Class.forName("oracle.jdbc.OracleDriver"); //loading the driver
		System.out.println("driver loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "delnex4d", "pass"); // orcl - instance name, this statement establishes connection with the database
		System.out.println("Connected");
		return con;
	}
	catch (Exception e) {
		e.printStackTrace();

	}

	return null;
}

}
