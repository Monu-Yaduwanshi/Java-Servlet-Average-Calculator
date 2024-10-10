package com.service9;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class AveragePrint extends HttpServlet {
	    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException 
	    {
	    	res.setContentType("text/html");
	        int i=Integer.parseInt(req.getParameter("num1"));
	        int j=Integer.parseInt(req.getParameter("num2"));
	        int k=Integer.parseInt(req.getParameter("num3"));
	   
		    PrintWriter out=res.getWriter();		
			out.print("<html><body><b>");
			out.print("\nSum of 3 Numbers is:"+(i+j+k));
			out.print("<br>Average of 3 Number is:"+(i+j+k)/3);
			out.print("</b></body></html>");
}
}