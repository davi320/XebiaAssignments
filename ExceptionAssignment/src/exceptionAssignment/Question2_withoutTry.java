package exceptionAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Question2_withoutTry {

	public static void main(String args[]) throws Exception {

		File file = new File("myFile_new");
		FileInputStream fis = new FileInputStream(file);
		System.out.println("Hello");
		

	}

}
