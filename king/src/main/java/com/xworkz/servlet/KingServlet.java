package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/king")
public class KingServlet extends HttpServlet {
	public KingServlet() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Runing init Config ");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running get in KingServlet");
		System.out.println(Thread.currentThread().getName());

		String name = req.getParameter("kingName");
		String region = req.getParameter("kingRegion");
		String queens = req.getParameter("noOfQueens");
		String dob = req.getParameter("dob");
		String dod = req.getParameter("dod");

		System.out.println(name);
		System.out.println(region);
		System.out.println(queens);
		System.out.println(dob);
		System.out.println(dod);

		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("<span style='color:red'>");
		write.print("kingName " + name + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");

		write.print("<h1>");
		write.print("<span style='color:pink'>");
		write.print("kingRegion " + region + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");

		write.print("<h1>");
		write.print("<span style='color:green'>");
		write.print("noOfQueens " + queens + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");

		write.print("<h1>");
		write.print("<span style='color:yellow'>");
		write.print("dob " + dob + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");

		write.print("<h1>");
		write.print("<span>");
		write.print("dod " + dod + " is sent successfully");
		write.print("</span style='color:blue'>");
		write.print("</h1>");
		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");
	}
}
