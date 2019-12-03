package com.codingdojo.simpleproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstNameParam = request.getParameter("firstName") == null ? "Unknown" : request.getParameter("firstName");
		String lastNameParam = request.getParameter("lastName") == null ? "Unknown" : request.getParameter("lastName");
		String locationParam = request.getParameter("location") == null ? "Unknown" : request.getParameter("location");
		String favLangParam = request.getParameter("favoritelastNameParamParam") == null ? "Unknown" : request.getParameter("favoriteLanguage");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		out.write("<h1>Hello, " + firstNameParam + " " + lastNameParam + "!</h1>");
		out.write("<h1>Your favorite language is, " + favLangParam + ".</h1>");
        out.write("<h1>Your hometown is, " + locationParam + ".</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
