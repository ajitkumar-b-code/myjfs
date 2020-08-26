package com.mysrv.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Serv1
 */
@WebServlet("/Serv1")
public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");

		out.print("servlet 1");
		int empId=Integer.parseInt(request.getParameter("empId"));
		int empAge= Integer.parseInt(request.getParameter("empAge"));
		String empName= request.getParameter("empName");
		String empAddress= request.getParameter("empAddress");

		Employee employee=new Employee(empId, empName, empAge, empAddress);

		// out.print("Session data "+var+"<br>");


		/*HttpSession session= request.getSession();
		session.setAttribute("employee", employee);*/
		
		out.print(employee);

		/*out.print("<form action='Serv2'>");
		out.print(" <input type='submit'>");
		out.print(" </form>");*/
	}

}
