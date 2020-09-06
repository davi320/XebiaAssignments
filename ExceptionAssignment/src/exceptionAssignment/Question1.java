package exceptionAssignment;

public class Question1 {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4,4,5,6,7,7,8 };

		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("finally block");
		}

	}
	
}
