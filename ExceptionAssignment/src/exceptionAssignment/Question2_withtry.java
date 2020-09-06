package exceptionAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Question2_withtry {
	public static void main(String args[]) {

		try {
			File file = new File("myFile_new");
			FileInputStream fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Hello");
		}

	}

}


