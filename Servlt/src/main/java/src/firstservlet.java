package src;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class firstservlet implements Servlet {

	// Life Cycle Methods
	ServletConfig conf;
	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("Creating object......");
	}
	public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException{
		System.out.println("Servicing....");
		// set content type of the response 
		resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	out.println("<h1>This is my output from servlet method</h1>");
	}
	public void destroy() {
		System.out.println("Going to destroy....Servlet Object");
	}
	// Non Life Cycle Method
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	public String getServletInfo() {
		return "this is Servlet is my First Servlet";
	}
}