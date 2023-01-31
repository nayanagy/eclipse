package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/radeon")
public class CompanyServlet extends HttpServlet {
	public CompanyServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Runing init Config");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running get in CompanyServlet");
		System.out.println(Thread.currentThread().getName());

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String startingPoint = req.getParameter("startingPoint");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");

		System.out.println(name);
		System.out.println(email);
		System.out.println(startingPoint);
		System.out.println(destination);
		System.out.println(gender);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");

		writer.print("<h1>");
		writer.print("<span style='color:blue'>");
		if (name.length() > 3 && email.length() > 3 && startingPoint.length() > 3 && destination.length() > 3) {
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
		writer.print("<br>");
		writer.print("<a href=\"Location.html\">Back to Location</a>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
}
