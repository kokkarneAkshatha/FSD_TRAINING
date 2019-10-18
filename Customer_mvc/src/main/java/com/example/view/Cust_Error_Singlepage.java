package com.example.view;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cust_Error_Singlepage extends HttpServlet {
	private static final long serialVersionUID = 1L;
  private List<String> l=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		
	}

	@SuppressWarnings("unchecked")
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	l=(List<String>) request.getAttribute("ERROR");
	if(l!=null)
	{
		out.println("please correct the bellow error(s)<br/>");
		for(String str:l)
		{
			out.println("<font color='red'>"+str+"</font><br/>");
		}
	}
	
	out.println("<!DOCTYPE html>\n" + 
			"<html>\n" + 
			"<head>\n" + 
			"<meta charset=\"UTF-8\">\n" + 
			"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n" + 
			"<title>Insert title here</title>\n" + 
			"</head>\n" + 
			"<body>\n" + 
			"<!-- Default form login -->\n" + 
			"<form class=\"text-center border border-light p-5\" action=\"Cust_Error_Singlepage\" method=\"post\">\n" + 
			"\n" + 
			"    <p class=\"h4 mb-4\">Input League Details.</p>\n" + 
			"\n" + 
			"    \n" + 
			"    <input type=\"text\" id=\"defaultLoginFormEmail\" class=\"form-control mb-4\" placeholder=\"year\" name=\"year\">\n" + 
			"\n" + 
			"    \n" + 
			"    <input type=\"text\" id=\"defaultLoginFormPassword\" class=\"form-control mb-4\" placeholder=\"title\" name=\"title\">\n" + 
			"\n" + 
			" <select class=\"browser-default custom-select\" name=\"season\">\n" + 
			"  <option value=\"Unknown\">Select A Season</option>\n" + 
			"  <option value=\"Winter\">Winter</option>\n" + 
			"  <option value=\"Summer\">Summer</option>\n" + 
			"  <option value=\"Autumn\">Autumn</option>\n" + 
			"</select>\n" + 
			"\n" + 
			"    <!-- Sign in button -->\n" + 
			"    <button class=\"btn btn-info btn-block my-4\" type=\"submit\">Add A New League</button>\n" + 
			"\n" + 
			"\n" + 
			"</form>\n" + 
			"\n" + 
			"</body>\n" + 
			"</html>");
	
	}

}