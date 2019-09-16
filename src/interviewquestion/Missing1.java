package interviewquestion;
import java.util.*;

public class Missing1 {
	
	public static void main(String[] args)
	{
		int[] array = {1,2,4,5};
		int missingNumber=getMissingNumber(array,5);
		System.out.printf("Missing number in array is %s is %d %n ",Arrays.toString(array),missingNumber);
		
	}

	private static int getMissingNumber(int[] array,int n)
	{
		int actualsum = 0;
		int expectedSum = (n*(n+1)/2);
		for (int i :array)
		{
			actualsum = actualsum +i;
		}
		
		return expectedSum-actualsum;
		
	}
	
	
}
