package basics;

public class ArraysExample {

	public static void main(String[] args) {

		//First way of declaring an array
		String countries[]= {"Australia", "Switzerland", "New Zealand"};
		System.out.println(countries[2]);
		System.out.println("Checking the git changes");

	

	//Second way of declaring

	String[] states= new String[4];
	states[0]="Adelaide";
	states[1]="Melbourne";
	states[2]="Sydney";
	states[3]="Brisbane";
	System.out.println(states[3]);
	
	
	
	//Third way of declaring
	String continents[];
	continents= new String[3];
	continents[0]= "Asia";
	continents[1]= "Europe";
	continents[2]= "Australia";
	System.out.println(continents[2]);
	}

}
