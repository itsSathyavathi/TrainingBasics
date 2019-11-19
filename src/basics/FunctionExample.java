package basics;

public class FunctionExample {
	
	public static void main(String[] args){
		int numA= 10;
		int numB= 20;
		addition(numA, numB);
		
	}
	
	static void addition(int numA, int numB){
		int sum=numA+numB;
		System.out.println(sum);
		System.out.println("The addition result " + sum);
		/*multiple(numA,numB);*/
		
	}
	
	static int multiple(int numA, int numB){
		int product= numA*numB;
		System.out.println("Multiplication results are " + product);
		return product;
		
		
	}

	public int subtraction(int numA, int numB){
		int subtraction= numA-numB;
		System.out.println("Subtraction results are " + subtraction);
		multiple( numA,  numB);
		return subtraction;
		
	}
}
