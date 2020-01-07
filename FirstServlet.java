package com.servlets.regtask;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import com.registertask.dao.UserDao;
import com.registertask.model.User;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname= request.getParameter("fname");
		String lname= request.getParameter("lname");
		String mobno= request.getParameter("mobno");
		String gender= request.getParameter("gender");
		String userid= request.getParameter("userid");
		String pass= request.getParameter("pass");

		User user = new User();

		user.setFirstName(fname);
		user.setLastName(lname);
		user.setMobileNo(Integer.parseInt(mobno));
		user.setGender(gender);
		user.setUserName(userid);
		user.setPassword(pass);

		UserDao dao=new UserDao();

		String data= dao.saveUser(user);

		PrintWriter out=response.getWriter();
		out.print(data);
	}


}
