package exceptionAssignment;

public class Question5 {
	public static void main(String[] args) 
	   {
		//Example 1
	     try {
	      String s = null;
	      System.out.println(s.toString() );  
	     }
	     catch(NullPointerException e)
	     {
	    	 System.out.println("null pointer exception-example1");
	    	 System.out.println(e.getMessage());
	     }
	     
	    
	    //Example 
	     try
	     {
	    	 funcExample2(null);
	     }
	     catch(NullPointerException e)
	     {
	    	 System.out.println("null pointer exception-example2");
	    	 System.out.println(e.getMessage());
	     }
	     
 
	   }
	
	 
    private static void funcExample2(String param) {
        System.out.println(param.toString());
     }
     

}
