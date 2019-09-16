package packages;

public class WrapperParse {
	
	

	public static void main(String[] args) {

		/* eg :- public static primitive parsexxx(String s,)
		 * This above method is used to convert string to prmitive 
		 * 
		 */
		
		int i = Integer.parseInt("10");
		System.out.println(i);
		
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		
		double d = Double.parseDouble("10.4");
		System.out.println(d);
		
		/* eg :- public static primitive parsexxx(String s,int radix);
		 * This above method can convert String ,binary to integer value
		 */
		
		int i1 = Integer.parseInt("1111",2);
		System.out.println(i1);
		
		
		

	}

}
