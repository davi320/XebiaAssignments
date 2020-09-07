package FileHandling;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class Question3 {
	
	
	public static void main(String[] args) throws IOException  
    { 
       
		//Write Java program to read input from java console
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 

        String name = reader.readLine(); 
 
        System.out.println(name);         
    } 

}
