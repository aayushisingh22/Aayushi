package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.ProductDetails;
import service.Service;


@WebServlet("/edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Service service=new Service();
		List<ProductDetails> listOfProducts=service.getProducts();
		if(listOfProducts!=null) {
			request.setAttribute("listOfProducts",listOfProducts);
			request.getRequestDispatcher("edit.jsp").forward(request,response);
			
		}else {
			response.getWriter().print("No Products to edit");
		}
		
	}

}
