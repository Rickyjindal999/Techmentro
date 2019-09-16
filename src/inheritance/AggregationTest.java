package inheritance;

public class AggregationTest {

	public static void main(String[] args) {
		
		Country c1 = new Country ("India","New Delhi",new HeadOfState("President","R.N.Kovind"));
		Country c2 = new Country ("UK","Londan",new HeadOfState("Queen","Elizabath II"));
		System.out.println("Details of the first country");
		c1.display();
		System.out.println("Details of 2nd country");
		c2.display();
		
		
		

	}

}
