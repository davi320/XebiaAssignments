package Exercise;

import java.util.ArrayList;

public class FindMissingCharacters {

	public static void main(String[] args) {

		char sampleArray[] = { 'a', 'b', 'c', 'd', 'f', 'h','j' };
		ArrayList<String> missingChar = new ArrayList<String>();

		for (int i = 1; i < (sampleArray.length - 1); i++) {

			//System.out.println(sampleArray[i]);

			if (((int) (sampleArray[i]) + 1) == (int) (sampleArray[i + 1])) {
			} else {
				missingChar.add(String.valueOf((char) ((int) (sampleArray[i]) + 1)));

			}

		}
		
		System.out.println("missing characters are :");
		for(String s:missingChar)
		{
			System.out.println(s);
		}
		

	}
}
