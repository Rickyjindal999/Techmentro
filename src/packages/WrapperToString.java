package packages;

public class WrapperToString {

	public static void main(String[] args) {
		
		/*Integer i = new Integer (10);
		String  s = i.toString();
		System.out.println(i.toString());*/
		
		
		String s = Integer.toString(10);
		
		//String s1 = Boolean.toString(ture);
		String s2 = Character.toString('a');
		System.out.println(s);
		//System.out.println(s1);
		System.out.println(s2);
		
		
		// public Static String toStirng(primitive p,int redix)
		
		String s1 = Integer.toString(15,2);
		System.out.println(s1);
		
		String s3 = Integer.toBinaryString(13);
		System.out.println(s3);
	
	}

}