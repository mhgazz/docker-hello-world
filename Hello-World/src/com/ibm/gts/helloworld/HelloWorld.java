package com.ibm.gts.helloworld;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.mq.samples.jms.*;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorldServlet")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloWorld() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("<html>");
		response.getWriter().append("<head>");
			response.getWriter().append("<link rel=\"stylesheet\" href=\"css/w3.css\">");
		response.getWriter().append("</head><body>");
		response.getWriter().append("<table><tr><td>");
		response.getWriter().append("<img src=\"images/envelope.jpeg\"/></td><td><p>Ingrese un mensaje");
		response.getWriter().append("<form method=\"POST\" action=\"HelloWorldServlet\">");
			response.getWriter().append("mensaje <input type=\"text\" name=\"message\">");
			response.getWriter().append("&nbsp;&nbsp;<input type=\"submit\" value=\"Enviar\">");
		response.getWriter().append("</form");
		response.getWriter().append("&nbsp;<form method=\"GET\" action=\"HelloWorldServlet\">");
			response.getWriter().append("<input type=\"submit\" value=\"Ver mensajes\">");
		response.getWriter().append("</form");
		
		// TODO Auto-generated method stub
		JmsPutGetodocker jms = new JmsPutGetodocker();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String messageParam = request.getParameter("message");
		if (messageParam==null || messageParam.isEmpty()) {
			String message = jms.getMessage();
			response.getWriter().append("<br/><br/>");
			response.getWriter().append("<p>mensajes recibidos:  ");
			if (message!=null) response.getWriter().append(message);
		}
		response.getWriter().append("</td></tr></table>");
		response.getWriter().append("</body><html>");


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String messageParam = request.getParameter("message");
		JmsPutGetodocker jms = new JmsPutGetodocker();
		jms.putMessage(" " + messageParam + " ");		
		doGet(request, response);
	}

}
