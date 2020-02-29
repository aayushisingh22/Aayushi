package controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.User;
import service.Service;
import util.UserValidation;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UserValidation valid = new UserValidation();

		Map<String, String> errorMessages = valid.loginValidation(email, password);
		if (errorMessages.size() > 0) {
			request.setAttribute("errorMessages", errorMessages);
			request.getRequestDispatcher("login.jsp").forward(request, response);

		} else {
			Service service = new Service();
			User loginDetails = service.fetchingLogindetails(email, password);
			if (loginDetails != null) {
				HttpSession session = request.getSession();
				session.setAttribute("loginDetails", loginDetails);
				System.out.println("login successfully");
				response.sendRedirect("modify.jsp");
			} else {
                 System.out.println("login failed");
                 request.setAttribute("loginDetails", loginDetails);
                 request.getRequestDispatcher("login.jsp").forward(request, response);
			}

		}

	}

}
