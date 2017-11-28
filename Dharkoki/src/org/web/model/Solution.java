package org.web.model;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.web.model.User;
public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUsername("koki");
		user.setPassword("123");
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

}
