package com.sohan.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String userName = request.getParameter("userName");
		String userId = request.getParameter("userId");
		response.getWriter().println(
				"<h3>Hello " + userName + " with userId=" + userId
						+ " in GET in XmlServlet</h3>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		String prof = request.getParameter("prof");
		String[] locations = request.getParameterValues("location");
		PrintWriter out = response.getWriter();
		out.println("Hello from POST method! <br><br>User Name: " + userName
				+ "<br>Full Name: " + fullName + "<br>Profession: " + prof
				+ "<br>" + locations.length + " locations: ");
		String prefix = "";
		String comma = ", ";
		String and = " and ";
		for (int i = 0; i < locations.length; i++) {
			if (i > 0) {
				if (i == locations.length - 1) {
					prefix = and;
				} else {
					prefix = comma;
				}
			}
			out.print(prefix + locations[i]);
		}
	}
}
