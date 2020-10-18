package testHibernate;

import java.util.Scanner;

public class EmployeeDAO {
	public static void main(String[] args) {

		Scanner operation = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter the operation you want to perform- read/Add/delete");

		String Operation = operation.nextLine(); // Read user input
		if (Operation.equalsIgnoreCase("Add")) {

			System.out.println("Insert Employee");
			System.out.println("Enter employee name, employee mobile number and employee id");

			String employeename = operation.nextLine();
			String employeemobileno = operation.nextLine();
			int employeeid = operation.nextInt();

			Employee_Add.insert_data(employeename, employeeid, employeemobileno);

		} else if (Operation.equalsIgnoreCase("read")) {

			System.out.println("Get Employee Data");
			System.out.println("Enter employee id for fetching employee data");
			int employeeid = operation.nextInt();
			Employee_read.get_data(employeeid);
		}
		
		else {

			System.out.println("delete Employee Data");

			System.out.println("Enter employee id for deleting employee data");
			int employeeid = operation.nextInt();
			Employee_Delete.delete(employeeid);
		}
		
		
	}
}