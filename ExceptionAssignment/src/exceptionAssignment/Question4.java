package exceptionAssignment;

public class Question4 {

	
	public static void main(String[] args){
		
		//example 1
        Object obj = new Integer(100);
        try {
        System.out.println((String) obj);
        }
        catch(ClassCastException c)
        {
        	System.out.println(c.getMessage());
        }
        
        
        //Example 2
        try {
        Parent p=new Parent();
        Child c=(Child) p;
        }
        catch(ClassCastException e)
        {
        	System.out.println(e.getMessage());
        }
        

}
}

class Parent {

	public Parent() {
		System.out.println("Constructor of Parent class");
	}

}

class Child extends Parent{
	
	public Child()
	{
		System.out.println("Constructor of Child class");
	}
	
}



