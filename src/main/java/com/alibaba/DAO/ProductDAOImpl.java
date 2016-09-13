package com.alibaba.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alibaba.model.Product;
@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	 SessionFactory sessionfactory;
	public void addProduct(Product product) {
		Session session=sessionfactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		session.save(product);
		transaction.commit();
		System.out.println("Done");
		
	}
	
	

}
