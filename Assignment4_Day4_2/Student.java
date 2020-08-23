package Assignment4_Day4_2;

public class Student {
	
	private int rollNo;
	private String studentName;
	private String studentCollegeName;
	
	
	public int getRollNo() {
		System.out.println("Function to get the roll number of the student");
		return rollNo;
	}
	
	
	public String getStudentCollegeName() {
		System.out.println("Function to get the college name of the student");
		return studentCollegeName;
	}
	
	public String getStudentName() {
		System.out.println("Function to get the  name of the student");
		return studentName;
	}
	
	
    public void setRollNo(int rollNo) {
    	System.out.println("Function to set the roll number of the student");
		this.rollNo = rollNo;
	}
	
    public void setStudentCollegeName(String studentCollegeName) {
    	System.out.println("Function to set the college name of the student");
		this.studentCollegeName = studentCollegeName;
	}
    
    public void setStudentName(String studentName) {
    	System.out.println("Function to set the name of the student");
		this.studentName = studentName;
	}
    
    
    
}
