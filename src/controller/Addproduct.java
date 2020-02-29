package controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.ProductDetails;
import service.Service;
import util.ProductValidation;

@WebServlet("/addproduct")
public class Addproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productName = request.getParameter("productName");
		String Price = request.getParameter("productPrice");
		Double productPrice = Double.valueOf(Price);
		String quantity = request.getParameter("noOfQuantity");
		Integer noOfQuantity = Integer.valueOf(quantity);
		String specifications = request.getParameter("specifications");
		System.out.println(specifications);
		ProductDetails pd=new ProductDetails();
		pd.setProductName(productName);
		pd.setProductPrice(productPrice);
		pd.setNoOfQuantity(noOfQuantity);
		pd.setSpecifications(specifications);
		
		ProductValidation valid=new ProductValidation();
		Map<String,String> errorMessages=valid.productValidation(pd);
		
		if(errorMessages.size()>0) {
			request.setAttribute("errorMessages", errorMessages);
			request.getRequestDispatcher("AddProduct.jsp").forward(request, response);
		}
		else {
			
			Service service =new Service();
			boolean productAdded=service.addProductsIntoDb(pd);
			if(productAdded) {
				response.sendRedirect("Addproduct.jsp");
			}
			else{
				request.getRequestDispatcher("Addproduct.jsp").forward(request, response);
				
			}
			
			
		}

	}

}
