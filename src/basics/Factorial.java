package basics;

public class Factorial {
	static int factorial1= 1;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		factorial(4);
		System.out.println(factorial1);
	}
	public static int factorial(int n){
		if(n==0)
		{
			return 1;
		}
             
             factorial1= factorial1*n;
			factorial(n-1); 
			
			return(factorial1);
		}
	
	/*public static int fact(int n){
		int factorial= n;
		for(int i=1;i<n;i++){
			factorial = factorial*i;
			
		}
		System.out.println(factorial);
		return factorial;
		
	}*/

}
