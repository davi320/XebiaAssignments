
package Assignment2_Day6_another_Package;
import Assignment2_Day6.*;


public class importPackageExample {
	
	public static void main(String[] args )
	{
	
		Assignment2_Day6.CalculatorClass calc=new Assignment2_Day6.CalculatorClass(20,10);
		calc.subtractNum();
		calc.multiplyNum();
		calc.divideNum();
		calc.factorialNum(5);
		calc.reverseNum(122536);
	
	}
	
}
