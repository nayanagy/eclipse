package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/webseries")
public class WebSeriesServlet extends HttpServlet {
	public WebSeriesServlet() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Runing init Config ");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running get in WebSeriesServlet");
		System.out.println(Thread.currentThread().getName());

		String name = req.getParameter("webseriesName");
		String lang = req.getParameter("webseriesLang");
		String episode = req.getParameter("webseriesEpisode");
		String ott = req.getParameter("webseriesOtt");
		String budget = req.getParameter("webseriesBudget");

		System.out.println(name);
		System.out.println(lang);
		System.out.println(episode);
		System.out.println(ott);
		System.out.println(budget);

		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("<span style='color:red'>");
		write.print("webseriesName " + name + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("<h1>");
		write.print("<span style='color:pink'>");
		write.print("webseriesLang " + lang + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("<h1>");
		write.print("<span style='color:green'>");
		write.print("webseriesEpisode " + episode + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("<h1>");
		write.print("<span style='color:yellow'>");
		write.print("webseriesOtt " + ott + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("<h1>");
		write.print("<span>");
		write.print("webseriesBudget " + budget + " is sent successfully");
		write.print("</span style='color:blue'>");
		write.print("</h1>");
		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");

	}

}
