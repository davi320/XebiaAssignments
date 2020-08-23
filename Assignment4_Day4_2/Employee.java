package Assignment4_Day4_2;

public class Employee {
	private String employeename;
	private float employeesalary;
	private float employeeCorpid;

	public float getEmployeeCorpid() {
		System.out.println("Function to get the corp id of the employee");
		return employeeCorpid;
	}

	public float getEmployeesalary() {
		System.out.println("Function to get the salary of the employee");
		return employeesalary;
	}

	public String getEmployeename() {
		System.out.println("Function to get the name of the employee");
		return employeename;
	}

	public void setEmployeeCorpid(float employeeCorpid) {
		System.out.println("Function to set the corp id of the employee");
		this.employeeCorpid = employeeCorpid;
	}

	public void setEmployeename(String employeename) {
		System.out.println("Function to set the name of the employee");
		this.employeename = employeename;
	}

	public void setEmployeesalary(float employeesalary) {
		System.out.println("Function to set the salary of the employee");
		this.employeesalary = employeesalary;
	}

}
