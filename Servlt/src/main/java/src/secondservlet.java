package src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class secondservlet extends GenericServlet {
	@Override
	public void service(ServletRequest arg,ServletResponse arg1) throws ServletException,IOException{
		System.out.println("This is my second servlet");
		arg1.setContentType("text/html");
		PrintWriter out = arg1.getWriter();
		out.println("<h1>This is my second servlet using Generic Servlet</h1>");
	}
}
