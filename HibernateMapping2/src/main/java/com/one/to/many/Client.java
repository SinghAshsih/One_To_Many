package com.one.to.many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("/com/one/to/many/hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// Department object
		Department d = new Department();
		d.setD_Name("Information Technology");
		d.setLocation("Orai");

		Employee employee = new Employee();
		employee.setE_Name("Atul");
		employee.setAge(27);
		employee.setDepartment(d);

		// 2nd employee
		Employee employee2 = new Employee();
		employee2.setE_Name("Isha");
		employee2.setAge(22);
		employee2.setDepartment(d);
		/*
		 * Employee e1 = new Employee(); e1.setE_Name("anu"); e1.setAge(24);
		 * e1.setDepartment(d);
		 */

		List<Employee> list = new ArrayList<Employee>();
		list.add(employee);
		list.add(employee2);
		// list.add(e1);
		d.setEmployee(list);

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(d);
		session.save(employee);
		session.save(employee2);
		// session.save(e1);

		tx.commit();

	}

}
