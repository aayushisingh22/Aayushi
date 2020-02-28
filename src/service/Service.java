package service;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import dto.User;

public class Service {


	@SuppressWarnings("unchecked")
	public <al> User fetchingLogindetails(String email, String password) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EcommerceDb");
		EntityManager em = emf.createEntityManager();
		
		try {
		@SuppressWarnings("unchecked")
		TypedQuery<User> resultset = (TypedQuery<User>) em
				.createQuery("from user_details where email=:email and password=:password");
		resultset.setParameter("email", email);
		resultset.setParameter("password", password);
		System.out.println(((User) resultset).getEmail());
	 return resultset.getSingleResult();
		}catch (Exception e) {                       
			return null;
			
		}

	
	}

}