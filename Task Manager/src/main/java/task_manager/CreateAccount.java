package task_manager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateAccount extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/jsp/CreateAccount.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Create Account logic
		String mail = req.getParameter("mail").toString();
		String username = req.getParameter("username").toString();
		String password = req.getParameter("password").toString();
		String repetpassword = req.getParameter("repetpassword").toString();

		if (!"root".equals(username) || !"".equals(password)) {
			// not correct
			// go back to login
			doGet(req, resp);
		} else {
			// correct! Greet!
			req.setAttribute("username", username);
			req.getRequestDispatcher("/myAccount").forward(req, resp);
		}
	}
}
