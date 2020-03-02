package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dto.ProductDetails;
import service.Service;
import util.ProductValidation;

@WebServlet("/addproduct")
@MultipartConfig
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
			request.getRequestDispatcher("Addproduct.jsp").forward(request, response);
		}
		else {
			
			Service service =new Service();
			boolean productAdded=service.addProductsIntoDb(pd);
			if(productAdded) {

				Part part = request.getPart("prodimg");
				InputStream inputStream = part.getInputStream();

				byte[] imageByteArray = new byte[inputStream.available()];

				inputStream.read(imageByteArray);

				String imagePath = request.getServletContext().getRealPath("/");

				imagePath = imagePath + "/images/";

				File imageFileDirectoryPath = new File(imagePath);
				if (!imageFileDirectoryPath.exists()) {
					imageFileDirectoryPath.mkdir();
				}

				FileOutputStream fileOutputStream = new FileOutputStream(
						imageFileDirectoryPath + "/" + pd.getProductId() + ".jpg");

				System.out.println(imageFileDirectoryPath.getPath());
				System.out.println(imageFileDirectoryPath.getAbsolutePath());

				fileOutputStream.write(imageByteArray);
				fileOutputStream.flush();
				fileOutputStream.close();
				response.sendRedirect("edit");
			}
			else{
				request.getRequestDispatcher("Addproduct.jsp").forward(request, response);
				
			}
			
			
		}

	}

}
