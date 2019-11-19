package oop;

public class BankAccount {
	static final String routingNumber= "98079790";

	String accountNumber;
	double balance;
	String accountType;
	
	BankAccount(){
		System.out.println("Default BankAccount");
	}
	
	BankAccount(String accountNumber, double initialDeposit){
		String Msg= null;
		if(initialDeposit<500){
			Msg= "Default BankAccount is less than  " + initialDeposit;
			System.out.println(Msg);
		}
		else{
			Msg= "Default BankAccount is more than  " + initialDeposit;
			System.out.println(Msg);
		}
		balance= initialDeposit;
	}

	void checkStatus(){

	}


	void deposit(){

	}

	void withDrawal(){

	}

	void viewBalance(){
		String msg= "Your balance is " + balance;
		System.out.println(msg);

	}

}
