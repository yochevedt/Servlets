package com.johnbryce;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class AddServlet extends HttpServlet {
	
//	@Override
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int a = Integer.parseInt(req.getParameter("num1"));
//		int b = Integer.parseInt(req.getParameter("num2"));
//		int sum = a + b;
//		PrintWriter out = res.getWriter();
//	out.println("sum is " + (a + b) + "sum is " + sum);
//	}
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int sum = a + b;
	   //System.out.println("sum is " + (a + b));
		PrintWriter out = res.getWriter();
		out.println("sum is " +  sum);
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int sum = a + b;
	   //System.out.println("sum is " + (a + b));
		PrintWriter out = res.getWriter();
		out.println("sum is " + (a + b) + sum);
	}

}
