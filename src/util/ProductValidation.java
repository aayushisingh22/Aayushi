package util;

import java.util.HashMap;
import java.util.Map;

import dto.ProductDetails;

public class ProductValidation {

	
	Map<String,String> mp=new HashMap<String,String>();
	public Map<String, String> productValidation(ProductDetails pd) {
	
		if(pd.getProductName().isEmpty()) {
			mp.put("productNameError", "enter product Name");	
		}
		if(pd.getProductPrice()==null) {
			mp.put("productPriceError", "enter product price");	
		}
		if(pd.getNoOfQuantity()==null) {
			mp.put("noOfQuantityError", "enter no of quantities");	
		}
		/*
		if(pd.getSpecifications().isEmpty()) {
			mp.put("specificationsError", "enter specifications");	
		}*/
		return mp;
		
	}
	
	

}