package Assignment2_Day6;

public class CalculatorClass {
	
	public int num1,num2;
	
	public CalculatorClass(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}

	public void subtractNum() {
		int result = num1 - num2;
		System.out.println("subtraction of "+num1+" from "+num2+" is: "+result);
	}

	public void multiplyNum() {
		int result = num1 * num2;
		System.out.println("multiplication of "+num1+" with "+num2+" is: "+result);
	}

	public void divideNum() {
		int result = num1 / num2;
		System.out.println("division of "+num1+" with "+num2+" gives result as : "+result);
	}

	public void factorialNum(int num) {
		int result = 1, i;
		for (i = 2; i <= num; i++)
			result *= i;
		System.out.println("Factorial of " +num +" is:  "+result);
	}

	public void reverseNum(int num) {
		int reversednum = 0;

        while(num != 0) {
            int digit = num % 10;
            reversednum = reversednum * 10 + digit;
            num /= 10;
        }
        
        System.out.println("Reverse of " +num +" is:  "+reversednum);
	}

}
