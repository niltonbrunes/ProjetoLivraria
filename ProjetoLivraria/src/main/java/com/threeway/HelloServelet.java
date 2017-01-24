package com.threeway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Acessei o servlet").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html)");
		out.append("<html>");
			out.append("<head>");
			out.append(<title>Miha pagina servlet</title>);
		out.append("</head>");
		out.append("<body>");
			out.append("<h1 style=\color: grey;\>pagina html com servlet</h1>");
		out.append(</body>);
		out.append(</html>);
}
