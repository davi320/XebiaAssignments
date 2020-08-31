package Exercise;

import java.util.Scanner;

public class FindRightAngledTriangle {
	
   public static void main(String[] args)
   {
	  
	   RightAngledTriangle rte=new RightAngledTriangle();
	   
		Scanner scan= new Scanner(System.in);
        System.out.println("Enter side A");//taking all the inputs from the user
        int sideA=scan.nextInt();
        rte.setSideA(sideA);
        
        System.out.println("Enter side B");//taking all the inputs from the user
        int sideB=scan.nextInt();
        rte.setSideB(sideB);
        
        System.out.println("Enter side C");//taking all the inputs from the user
        int sideC=scan.nextInt();
        rte.setSideC(sideC);
	   
	   
        Boolean flag=rte.findRightAngledTriangle();
        
        if(flag)
        {
        	System.out.println("According to the length of the sides given, the given triangle is a right angled triangle");
        }
        else
        {
        	System.out.println("According to the length of the sides given, the given triangle is not a right angled triangle");
        }
	   
   }
	
}




