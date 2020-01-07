package com.registertask.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.registertask.model.User;
import com.registertask.dbutil.DbConn;



public class UserDao {

	public String saveUser(User user)
	{
		try
		{
			Connection con= DbConn.getConn();
			String sql="insert into userbase values(?,?,?,?,?,?)"; 
			PreparedStatement stat= con.prepareStatement(sql);

			stat.setString(1, user.getFirstName());
			stat.setString(2, user.getLastName());
			stat.setLong(3, user.getMobileNo());
			stat.setString(4, user.getGender());
			stat.setString(5, user.getUserName());
			stat.setString(6, user.getPassword());


			int res=stat.executeUpdate();
			if(res>0)
				return "success";
		}
		
		catch (Exception e) {
			e.printStackTrace();
			return "Exception while inserting the recs";
		}

		return "cannot insert Recs";
	}
	
	
	public boolean getUserLogin(String userid, String pass)
	{
		try
		{

			Connection con=DbConn.getConn();
			String sql="select * from userbase where userid=? and pass=?";
			PreparedStatement stat= con.prepareStatement(sql);

			stat.setString(1, userid);
			stat.setString(2, pass);
			
			
			ResultSet rs=stat.executeQuery();

			if(rs.next())
			{
				
				return true;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	return false;
	}
	
	
}
