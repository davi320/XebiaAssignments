package assignment_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReversingElementInArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String name="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count of users to be added to the list");
		int count=scan.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Add the name of "+(i+1)+" user");
			name=scan.next();
			list.add(name);
		}
System.out.println("The list of Array before reversing :\n"+list);
Collections.reverse(list);
System.out.println("The list of Array after reversing : \n"+list);
	}

}
