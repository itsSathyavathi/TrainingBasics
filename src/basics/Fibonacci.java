package basics;

public class Fibonacci {
	
	public static void main(String[] args){
		
		fib(6);
		fibExample();
	}

	public static int fib(int n){
		if(n==0){
			System.out.println(0);
			return 0;
		}
		else if(n==1){
			System.out.println(n);
			return n;
		}
		else
		{
		int	fibResult=(n-1)+(n-2);
		System.out.println(fibResult);
			return fibResult;
		}
		
	}
	
	public static int fibExample(){
		int fibResult = 0;
		for(int n=2; n<=6																																								;n++){
			 fibResult= (n-1)+(n-2);
			System.out.println("Result "+fibResult );
			//return((n-1)+(n-2));
		}
		return fibResult;
		
		
	}
}
