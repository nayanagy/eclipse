package com.xworkz.Tshirt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 4, urlPatterns = "/figServlet")
public class FigServlet extends HttpServlet {
	public FigServlet() {
		System.out.println("running Default const of FigServlet");
	}

	private void doget() {
		System.out.println("running do get method in FigServlet");

	}
}
