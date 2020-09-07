package FileHandling;

import java.io.File;

public class Question1 {
	
//Write a Java program to get a list of all file/directory names from the given
	
	
	public static void main(String a[])
    {
       File file = new File("C:\\Users\\WG\\Desktop\\Xebia_Assignments_FIL");
       String[] fileList = file.list();
       for(String name:fileList){
           System.out.println(name);
       }
   }

}
