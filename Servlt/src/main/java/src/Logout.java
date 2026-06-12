package src;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class Logout extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest resq, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=resq.getSession();
		session.invalidate();
		RequestDispatcher rd=resq.getRequestDispatcher("/Login.html");
		rd.forward(resq, resp);
	}
}
