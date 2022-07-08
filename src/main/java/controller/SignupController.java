package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserBean;
import dao.UserDao;

@WebServlet("/SignupController")
public class SignupController extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		
boolean isError = false;
		
		if(firstname == null || firstname.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstnameError","please enter firstname");
		}else {
			request.setAttribute("firstnamevalue",firstname);
		}
		if(lastname == null || lastname.trim().length() == 0) {
			isError = true;
			request.setAttribute("lastnameError","please enter lastname");
		}else {
			request.setAttribute("lastnamevalue",lastname);
		}
		if(email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError","please enter email");
		}else {
			request.setAttribute("emailvalue",email);
		}
		if(password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError","please enter password");
		}else {
			request.setAttribute("passwordvalue",password);
		}
		if(gender == null || gender.trim().length() == 0) {
			isError = true;
			request.setAttribute("genderError","please select gender");
		}else {
			request.setAttribute("gendervalue",gender);
		}
		RequestDispatcher rd = null;
		if (isError == true ) {
			rd= request.getRequestDispatcher("Signup.jsp");
		}else {
			UserBean userbean = new UserBean();
			UserDao userdeo = new UserDao();
			
			userbean.setFirstname(firstname);
			userbean.setLastname(lastname);
			userbean.setEmail(email);
			userbean.setPassword(password);
			userbean.setGender(gender);

			userdeo.insertuser(userbean);
			
			
			rd= request.getRequestDispatcher("Home.jsp");
		}
		rd.forward(request, response);
	}
}
