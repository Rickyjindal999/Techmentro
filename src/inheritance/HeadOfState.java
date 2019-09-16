package inheritance;

class HeadOfState {

	// owned entity class
	
		private String title ,name;
		
		public HeadOfState (String t,String n)
		{
			title = t;
			name = n;
		}
	public void display()
	{
		System.out.println(title +"  " + name);
	}	
}
