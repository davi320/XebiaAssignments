package Assignment4_Day_4_1;
import java.util.*;

public class CalculateSalaryBasedonInput {
	
	public static void main(String[] args)
	{
		SalaryCalculator calcSalary=new SalaryCalculator();
		
		Scanner scan= new Scanner(System.in);
        System.out.println("Enter the employee id");//taking all the inputs from the user
        String employeid=scan.next();
        calcSalary.setemployeeId(employeid);
        
        
        System.out.println("Enter the employee name");
        String empname=scan.next();
        calcSalary.setemployeeName(empname);
        
  
        System.out.println("Enter the basic salary of an employee");
        float basicsalary=scan.nextFloat();
        calcSalary.setbasicSalary(basicsalary);
        
        float netsalary=calcSalary.calculate();
        calcSalary.displaySalary(netsalary);

	}
     
}
