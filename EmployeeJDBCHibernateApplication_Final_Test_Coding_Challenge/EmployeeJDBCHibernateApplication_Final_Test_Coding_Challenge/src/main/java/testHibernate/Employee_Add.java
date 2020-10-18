package testHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Employee_Add {
	public static void insert_data(String employeename, int employeeid, String Mobilno) {
		try {
			SessionFactory sessionfactory = new AnnotationConfiguration().configure("hibernate.cfg.xml")
					.buildSessionFactory();
			Session session = sessionfactory.openSession();
			Employee obj_Employee = new Employee();
			obj_Employee.setEmployeeid(employeeid);
			obj_Employee.setEmployee_name(employeename);
			obj_Employee.setMobil_no(Mobilno);
			session.save(obj_Employee);
			session.beginTransaction().commit();
			session.close();
			sessionfactory.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}