package Assignment4_Day4_2;

public class setAndGetValues {
	
	public static void main(String[] args)
	{
		
		Bank bnk=new Bank();
		Student st=new Student();
		Employee emp=new Employee();
		
		//set and display bank properties
        bnk.setBankIFSCcode("ABC12456123");
		bnk.setBankName("ABC BANK");
		System.out.println("The bank IFSC Code is : " +bnk.getBankIFSCcode()+ "  and the bank name is : " +bnk.getBankName());
		
		
		//set and display Student properties
        st.setRollNo(1241243);
		st.setStudentCollegeName("ABC COLLEGE");
		st.setStudentName("Robert");
		System.out.println("The student name is : " +st.getStudentName()+ "  and the student college name is : " +st.getStudentCollegeName()+ "  and the roll number of the student is:" +st.getRollNo());
		
		
		//set and display Employee properties
		emp.setEmployeeCorpid(12265);
		emp.setEmployeename("William");
		emp.setEmployeesalary(10000);
		System.out.println("The employee name is : " +emp.getEmployeename()+ "  and the employee salary is : " +emp.getEmployeesalary()+ "  and the corp id of the employee is:" +emp.getEmployeeCorpid());
		
		
		
		
		
	}

}
