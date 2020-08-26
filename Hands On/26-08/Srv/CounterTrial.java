package com.mysrv.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CounterTrial")
public class CounterTrial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 private int iHitCounter;
    public CounterTrial() {
        super();
    }

    @Override
    public void init() throws ServletException {
    	iHitCounter = 0;
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out =  response.getWriter();
		response.setContentType("text/html");
        out.println("<form><fieldset style='width:15%'>");
        out.println("<h3>Welcome to my website !</h3><hr>");
        out.println("You are visitor number: "+ (++iHitCounter));
        out.println("</fieldset></form>");
	}

}
