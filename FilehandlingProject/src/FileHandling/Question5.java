package FileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;


public class Question5 {
	
	public static void main( String[] args ) {

	      try {
	         String data = " Writing sample text to append in the existing file";
	         File f1 = new File("C:\\\\Users\\\\WG\\\\Desktop\\\\Xebia_Assignments_FIL\\\\Sample_text_file.txt");
	         if(!f1.exists()) {
	            f1.createNewFile();
	         }

	         FileWriter fileWriter = new FileWriter(f1.getName(),true);
	         BufferedWriter bw = new BufferedWriter(fileWriter);
	         bw.write(data);
	         bw.close();
	         System.out.println("appended given text in the file");
	      } catch(IOException e){
	         e.printStackTrace();
	      }
	   
	
	
	}

}
