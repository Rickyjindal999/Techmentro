package interviewquestion;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,5};
		// Easiest way to find out the missing number
		int sum = 0;
		for (int i=0;i<=a.length;i++)
		{
			sum = sum + i;
		}
		
		int sum1 = 0;
		for (int j=0;j<=5;j++)
		{
			sum1 = sum1 + j;
		}
		
		
		System.out.println(sum1-sum);

	}

}
