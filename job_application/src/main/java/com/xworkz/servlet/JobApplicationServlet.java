package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/job")
public class JobApplicationServlet extends HttpServlet {
	public JobApplicationServlet() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Runing init Config ");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running get in JobApplicationServlet");
		System.out.println(Thread.currentThread().getName());

		String firstName = req.getParameter("studentFName");
		String lastName = req.getParameter("studentLName");
		String dob = req.getParameter("dateOfBirth");
		String usn = req.getParameter("usn");
		String gender = req.getParameter("gender");
		String collegeName = req.getParameter("collegeName");
		String collegeLocation = req.getParameter("collegeLocation");
		String qualification = req.getParameter("qualification");
		String mobilenumber = req.getParameter("mobilenumber");
		String sslc = req.getParameter("10percentage");
		String puc = req.getParameter("12percentage");
		String aadhar = req.getParameter("Aadharno");
		String area = req.getParameter("area");
		String city = req.getParameter("city");
		String state= req.getParameter("state");
		String country=req.getParameter("country");
		String pincode=req.getParameter("pincode");
		String specialization=req.getParameter("Specialization");
		String BEpercentage=req.getParameter("BEpercentage");
		String yearOfPassout=req.getParameter("yearOfPassout");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(dob);
		System.out.println(usn);
		System.out.println(gender);
		System.out.println(collegeName);
		System.out.println(collegeLocation);
		System.out.println(qualification);
		System.out.println(mobilenumber);
		System.out.println(sslc);
		System.out.println(puc);
		System.out.println(aadhar);
		System.out.println(area);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
		System.out.println(pincode);
		System.out.println(specialization);
		System.out.println(BEpercentage);
		System.out.println(yearOfPassout);

		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("<span style='color:red'>");
		write.print("studentFName " + firstName + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");

		write.print("<h1>");
		write.print("<span style='color:pink'>");
		write.print("studentLName " + lastName + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");

		write.print("<h1>");
		write.print("<span style='color:green'>");
		write.print("dateOfBirth " + dob + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");

		write.print("<h1>");
		write.print("<span style='color:yellow'>");
		write.print("usn " + usn + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");

		write.print("<h1>");
		write.print("<span style='color:blue'>");
		write.print("Gender " + gender + " is sent successfully");
		write.print("</span >");
		write.print("</h1>");
	
		write.print("<h1>");
		write.print("<span style='color:red'>");
		write.print("CollegeName " + collegeName + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
	
		write.print("<h1>");
		write.print("<span style='color:blue'>");
		write.print("CollegeLocation " + collegeLocation + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
	
		write.print("<h1>");
		write.print("<span style='color:green'>");
		write.print("qualification " + qualification + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("<h1>");
		write.print("<span style='color:blue'>");
		write.print("Specialization " + specialization + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("<h1>");
		write.print("<span style='color:black'>");
		write.print("mobilenumber " + mobilenumber + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("<h1>");
		write.print("<span style='color:blue'>");
		write.print("10percentage " + sslc + "% is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("<h1>");
		write.print("<span style='color:blue'>");
		write.print("12percentage " + puc + "% is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		

		write.print("<h1>");
		write.print("<span style='color:red'>");
		write.print("BEpercentage " + BEpercentage + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("<h1>");
		write.print("<span style='color:blue'>");
		write.print("yearOfPassout " + yearOfPassout + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("<h1>");
		write.print("<span >");
		write.print("Aadhar number " + aadhar + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("<h1>");
		write.print("<span style='color:green'>");
		write.print("Area " + area + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("<h1>");
		write.print("<span>");
		write.print("City " + city + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("<h1>");
		write.print("<span style='color:green'>");
		write.print("state " + state + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("<h1>");
		write.print("<span style='color:blue'>");
		write.print("country " + country + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("<h1>");
		write.print("<span style='color:red'>");
		write.print("pincode " + pincode + " is sent successfully");
		write.print("</span>");
		write.print("</h1>");
		
		write.print("</body>");
		write.print("</html>");	
		resp.setContentType("text/html");
	}
}
