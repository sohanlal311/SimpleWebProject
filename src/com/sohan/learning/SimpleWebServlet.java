package com.sohan.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleWebServlet
 */
@WebServlet(name = "simpleWebServlet", description = "A simple web servlet", urlPatterns = {
		"/simpleServletPath" }, initParams = { @WebInitParam(name = "DefaultUser", value = "Sohan") })
public class SimpleWebServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("name");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if (userName != null && !userName.isEmpty()) {
			session.setAttribute("name", userName);
			context.setAttribute("name", userName);
		}
		PrintWriter out = response.getWriter();
		out.println("Parameter name from request: " + userName);
		out.println("Parameter name from session: " + (String) session.getAttribute("name"));
		out.println("Parameter name from context: " + (String) context.getAttribute("name"));

		String defaultUser = this.getServletConfig().getInitParameter("DefaultUser");
		out.println("Parameter name from Config: " + (String) defaultUser);
	}

}
