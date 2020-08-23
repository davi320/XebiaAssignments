package Assignment4_Day_4_1;

public class SalaryCalculator {
	
	private String employeid;
    private String empname;
    public float basicsalary,HRA,DA,GS,incometax;
    public float netsalary;
    
    
    public void setbasicSalary(float basicsalary)
    {
    	this.basicsalary=basicsalary;
    }
	
    public void setemployeeId(String employeid)
    {
    	this.employeid=employeid;
    }
    
    public void setemployeeName(String empname)
    {
    	this.empname=empname;
    }
     
    public float calculate()  
    {
       System.out.println(basicsalary);
       HRA=(float) (0.1 *  basicsalary) ;
       DA=(float) (0.73*basicsalary);
       GS=basicsalary+DA+HRA;  
       
       incometax=(float) (0.3*GS);
       netsalary=(float)(GS-incometax);
       return netsalary;
    }
    
    public void displaySalary(float netsalary) {
    	System.out.println("The calculated salary is :"+netsalary);
    }
	
	

}

