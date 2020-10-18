package testHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Employee_Delete {
	public static void delete(int employeeid) {
		try {
			SessionFactory sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
			Session session = sessionfactory.openSession();
			Employee obj_Employee = new Employee();
			obj_Employee.setEmployeeid(employeeid);
			System.out.println("Deleting employee with employee id " + obj_Employee.getEmployeeid());
			session.delete(obj_Employee);
			System.out.println("Deleted");
			session.beginTransaction().commit();
			session.close();
			sessionfactory.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}