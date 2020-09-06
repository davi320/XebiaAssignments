package exceptionAssignment;

public class Question3 {
	
public static void main(String[] args) {
		
		try{
		int firstNum = 25;
		int secondNum = 20%2;
		
		int divided_number = firstNum/secondNum;
		System.out.println("Result : "+ divided_number);
		}catch(ArithmeticException ae){
			System.out.println("Arithmetic Exception caught");
		}
		
		System.out.println("After division");
	}

}
