package com.servlets.regtask;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import com.registertask.dao.UserDao;
//import com.registertask.model.User;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		String userid= request.getParameter("userid");
		String pass= request.getParameter("pass");

		UserDao dao=new UserDao();

		boolean data= dao.getUserLogin(userid, pass);

		PrintWriter out=response.getWriter();
		if (data == true)  out.print("Login successful");
		else out.print("Login failed");
		
	}


}
