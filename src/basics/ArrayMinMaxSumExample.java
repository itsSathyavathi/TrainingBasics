package basics;

public class ArrayMinMaxSumExample {

	public static void main(String args[]){
		int numArray[]= {1, 2, 3};
		minFunction(numArray);
		maxFunction(numArray);
		average(numArray);
	}

	private static int average(int num[]) {
		int sum=0;
		for (int i = 0 ; i<num.length; i++){
			sum= (sum+num[i]);
		}
		int average= sum/num.length;
		System.out.println(average);
		return average;
	}

	private static int maxFunction(int num[]) {
		int maximumValue= num[0];
		for(int i = 0; i<num.length; i++){
			if(num[i]>maximumValue)
				maximumValue= num[i];
		}
		return maximumValue;
	}

	private static int minFunction(int num[]) {
		int minimumValue=num[0];
		for(int i=0; i<num.length; i++){
			if(num[i]<minimumValue)
				minimumValue= num[i];


		}
		return minimumValue;
	}

}
