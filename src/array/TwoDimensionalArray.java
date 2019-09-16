package array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int[][] a = {{10,33,44},{12,34},{43,88}};
		
		for (int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
