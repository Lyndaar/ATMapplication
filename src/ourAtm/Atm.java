package ourAtm;
import java.util.Scanner;

public class Atm {
	Scanner in = new Scanner(System.in);
	
	double balance = 5000.0;
	int input;
	
	//constructor.
	public Atm() {
		System.out.println("Thank you for choosing our bank");
		System.out.println("please choose a transaction \n" + "1. check balance \n" + "2. deposit");
		
		
	}
public void checkBalance() {
	input = in.nextInt();
	if (input == 1) {
		System.out.println(" Your balance is= " + balance);	
	}else if (input == 2) {
		System.out.println("HOW MUCH DO YOU WANT TO DEPOSIT");
		double amount;
		amount = in.nextDouble();	
	    balance += amount;
	    System.out.println("You just deposited:" + amount);
	    checkBalance();
		
	}else {
		System.out.println("you have not made a valid selection");	
	}
	
	
}
N 

/** public void deposit() {
	double amount;
	amount = in.nextDouble();
	System.out.println("HOW MUCH DO YOU WANT TO DEPOSIT");	
    balance += amount;
    System.out.println("You just deposited:" + amount);
    checkBalance();}
    */

public void newTransaction() {
	
	String option_one;
	 Scanner element = new Scanner (System.in);
	System.out.println("DO YOU WISH TO PERFORM A NEW TRANSACTION?"+ "\n" +"YES" +"\n" + "NO");
	System.out.println ("********************************* \n");
	option_one = element.nextLine();
	if(option_one.equals("YES" )){
		System.out.println ("********************************* \n");
		Atm a = new Atm();
		a.checkBalance();
		 
	}else {
		System.out.print("THANKS FOR BANKING WITH US.");
	}
}

	//constructor.
	public static void main(String[]args) {
		Atm a = new Atm();
		a.checkBalance();
		a.checkBalance();
		a.newTransaction();
		 
	
}
}
