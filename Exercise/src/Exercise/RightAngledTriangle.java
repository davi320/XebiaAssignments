package Exercise;

import java.util.Scanner;

public class RightAngledTriangle {
	
	private int sideA;
	private int sideB;
	private int sideC;
	
	
	public int getSideA() {
		return sideA;
	}
	
	public int getSideB() {
		return sideB;
	}
	
	public int getSideC() {
		return sideC;
	}
	
	public void setSideA(int sideA) {
		this.sideA = sideA;
	}
	
	public void setSideB(int sideB) {
		this.sideB = sideB;
	}
	
	public void setSideC(int sideC) {
		this.sideC = sideC;
	}

	
	public Boolean findRightAngledTriangle()
	{
		Boolean flag=false;
		if((sideA*sideA)  +  (sideB*sideB) == (sideC*sideC))
		{
			flag=true;
		}
		else if((sideB*sideB)  +  (sideC*sideC) == (sideA*sideA))
		{
			flag=true;
		}
		else if((sideA*sideA)  +  (sideC*sideC) == (sideB*sideB))
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		
		
		return flag;
		
	}
	
	
}


