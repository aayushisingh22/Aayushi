package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.ProductDetails;
import service.Service;

@WebServlet("/modifyDetails")
public class ModifyDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		int productId = Integer.parseInt(id);
		Service service = new Service();
		ProductDetails productDetails = service.getProductsById(productId);
		if (productDetails != null) {
			request.setAttribute("productDetails", productDetails);
			request.getRequestDispatcher("updatedProductDetails.jsp").forward(request, response);
		} else {
			response.getWriter().println("internal errors");
		}

	}

}
