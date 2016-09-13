package com.alibaba.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alibaba.model.Register;
@Repository
public class RegisterDAOImpl implements RegisterDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	public void registerUser(Register register) {
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.save(register);
		tx.commit();
		System.out.println("Done");
	}
	
	

}
