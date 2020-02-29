package service;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import dto.ProductDetails;
import dto.User;

public class Service {


	@SuppressWarnings("unchecked")
	public <al> User fetchingLogindetails(String email, String password) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EcommerceDb");
		EntityManager em = emf.createEntityManager();
		
		try {
		@SuppressWarnings("unchecked")
		TypedQuery<User> resultset =  em
				.createQuery("from User where email=:email and password=:password",User.class);
		resultset.setParameter("email", email);
		resultset.setParameter("password", password);
		
	 return resultset.getSingleResult();
		}catch (Exception e) {  
			e.printStackTrace();
			return null;
			
		}

	
	}

	public boolean dataBaseConnection(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EcommerceDb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return false;
		
	}

	public boolean addProductsIntoDb(ProductDetails pd) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EcommerceDb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(pd);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return false;
		
		
		
	}
}