package com.xworkz.Tshirt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 5, urlPatterns = "/AllenSolly")
public class AllenSollyServlet extends HttpServlet {
	public AllenSollyServlet() {
		System.out.println("running Default const of AllenSollyServlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("running do get method in AllenSollyServlet");
	}

}
