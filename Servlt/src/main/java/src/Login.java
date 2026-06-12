package src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/myLogin")
public class Login extends HttpServlet {
@Override
protected void service(HttpServletRequest resq, HttpServletResponse resp) throws ServletException, IOException {
	String name=resq.getParameter("name1");
	String pass=resq.getParameter("pass1");
	PrintWriter out=resp.getWriter();
	if(name.equals("Avantii") && pass.equals("123")) {
//		resq.setAttribute("name1" , "Vijeta");
		HttpSession session = resq.getSession();
		session.setAttribute("name1", "Vijeta");
	RequestDispatcher rd=resq.getRequestDispatcher("/Profile.jsp");
	rd.forward(resq, resp);
	}else
	{
//		RequestDispatcher rd=resq.getRequestDispatcher("/Login.html");
//		rd.forward(resq, resp);
		resp.setContentType("text/html");
		out.println("<h1 style='color:red'>Email ID and password didn't match!</h1>");
		RequestDispatcher rd=resq.getRequestDispatcher("/Login.html");
		rd.include(resq, resp);
	}
}
}
