package src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;character=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Servlet Calculator</title></head><body>");
		double n1=Double.parseDouble(request.getParameter("n1"));
		double n2=Double.parseDouble(request.getParameter("n2"));
		double result = 0;
		String opr=request.getParameter("opr");
		if(opr.equals("+"))result=n1+n2;
		if(opr.equals("-"))result=n1-n2;
		if(opr.equals("*"))result=n1*n2;
		if(opr.equals("/"))result=n1/n2;
		out.println("<h1>Result= "+result);
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
