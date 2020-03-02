package service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import dto.ProductDetails;
import dto.User;

public class Service {

	private EntityManager entityManager;

	public Service() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EcommerceDb");
		entityManager = emf.createEntityManager();

	}

	public User fetchingLogindetails(String email, String password) {

		try {
			TypedQuery<User> resultset = entityManager
					.createQuery("from User where email=:email and password=:password", User.class);
			resultset.setParameter("email", email);
			resultset.setParameter("password", password);

			return resultset.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}

	}

	public boolean dataBaseConnection(User user) {
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

	public List<ProductDetails> getProducts() {
		try {
			TypedQuery<ProductDetails> resultset = entityManager.createQuery("from ProductDetails",
					ProductDetails.class);
			return resultset.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	public ProductDetails getProductsById(Integer productId) {
		// TODO Auto-generated method stub
		try {
			TypedQuery<ProductDetails> resultset = entityManager.createQuery("from ProductDetails where productId=:id",
					ProductDetails.class);
			resultset.setParameter("id", productId);

			return resultset.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}
}
