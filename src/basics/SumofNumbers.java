package basics;

public class SumofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		sum();
		sumAdd(5);

	}

	public static int sumAdd(int n){
		int total=n;
		for(int i =0; i<n; i++){
			total= total+i;	
		}
		System.out.println("The sum of " + n + " is " + total);
		return total;

	}
}
