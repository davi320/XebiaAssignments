package Assignment1_Day6;

import java.util.ArrayList;
import java.util.List;

interface Queue {
	void add(int elementTobeAdded);

	void remove(int elementToberemoved);
}

class Queue1 implements Queue {

	public List elementList = null;

	public Queue1(List elementList) {
		this.elementList = elementList;
	}

	@Override
	public void add(int elementTobeAdded) {
		elementList.add(elementTobeAdded);
	}

	@Override
	//add functionality---
	public void remove(int elementToberemoved) {
		elementList.remove(elementToberemoved);
	}
	
	public void printlistElements()
	{
		for (int i=0;i<elementList.size();i++)
		{
			System.out.println(elementList.get(i));
		}
	}

}

public class QueueInterfaceAssigmt {
	
	public static void main(String[] args)
	{

		ArrayList<Integer> elementList=new ArrayList<Integer>();
		for (int i=1;i<=5;i++)
		{
			elementList.add(i);
		}
		
		
		Queue1 q1=new Queue1(elementList);
		System.out.println("before adding:" );
		q1.printlistElements();
		
		q1.add(8);
		q1.add(10);
		System.out.println("after adding:" );
		q1.printlistElements();
		
		q1.remove(1);
		
		System.out.println("after removing:" );
		q1.printlistElements();
		
	}
	

}
