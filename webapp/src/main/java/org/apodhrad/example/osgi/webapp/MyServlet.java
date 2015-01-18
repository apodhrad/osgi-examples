package org.apodhrad.example.osgi.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/secure/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hello MyServlet\n");
		out.println(toString(request));
		out.flush();
		out.close();
	}
	
	private String toString(HttpServletRequest request) {
		StringBuffer result = new StringBuffer();
		result.append("Session: " + request.getSession()).append("\n");
		result.append("Principal: " + request.getUserPrincipal()).append("\n");
		result.append("RemoteUser: " + request.getRemoteUser()).append("\n");
		result.append("Attributes:").append("\n");
		Enumeration<String> names = request.getSession().getAttributeNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			result.append("Name: " + name).append(" ");
			result.append("Value: " + request.getSession().getAttribute(name)).append("\n");
		}
		
		return result.toString();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
