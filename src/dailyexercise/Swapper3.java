package dailyexercise;

public class Swapper3 {

	
	public static void swap(Swapper1 x,Swapper1 y)
	{
		int z = x.value;
		x.value = y.value;
		y.value = z;
	}
}
