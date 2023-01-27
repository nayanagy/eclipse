package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/ryzon")
public class Contactservlet extends HttpServlet {
public Contactservlet() {
	System.out.println("Created " + this.getClass().getSimpleName());
}@Override
public void init() throws ServletException {
	System.out.println("Runing init Config");
}

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running get in CompanyServlet");
	System.out.println(Thread.currentThread().getName());
	
	String contactName=req.getParameter("contactName");
	String contactEmail=req.getParameter("contactEmail");
	String contactmobileNumber=req.getParameter("contactmobileNumber");
	String comments=req.getParameter("comments");
	
	System.out.println(contactName);
	System.out.println(contactEmail);
	System.out.println(contactmobileNumber);
	System.out.println(comments);
	
	PrintWriter writer = resp.getWriter();
	writer.print("<html>");
	writer.print("<body>");
	
	writer.print("<h1>");
	writer.print("<span style='color:blue'>");
	Long convertedNum=Long.parseLong(contactmobileNumber);
	if( contactName.length() > 3 && contactEmail.length() > 3 && comments.length() > 3 &&convertedNum>0) {
		writer.print("<span style='color:green'>");
		writer.print("Sign up succesfully");
		writer.print("</span>");
	} else {
		writer.print("<span style='color:red'>");
		writer.print("Please provide valid information");
		writer.print("</span>");
	}
	
	writer.print("</span>");
	writer.print("</h1>");
	writer.print("<a href=\"index.html\">Home</a>");
	writer.print("</body>");
	writer.print("</html>");
	resp.setContentType("text/html");
}
}

