package ourAtm;
import java.util.Scanner;
/*
 * this program shows the basic operations/transactions of a Bank ATM
 * such as;
 * check balance
 * withdraw
 * deposit
 * change pin
 */

public class Atm {
	Scanner in = new Scanner(System.in);
	//declaring and initializing variables
	int pin= 9090;
	double balance = 20000.0;
	int input;
	
	//constructor.
	public Atm() {
		System.out.println("WELCOME TO OUR BANK! \n");
		System.out.println("-----------------------------------------------");
		
	}
	
	public void Bank() {
		System.out.println ("Please Enter your Secret pin \n");
		int Pin;
		 Scanner element = new Scanner (System.in);
		 Pin = element.nextInt();
		 if (Pin == pin) {
				System.out.println("-----------------------------------------------");
			    System.out.println ("please choose a Transaction \n");
				System.out.println ("1. CHECK BALANCE");
				System.out.println ("2. DEPOSIT");
				System.out.println ("3. WITHDRAW");
				System.out.println ("4. CHANGE PIN \n");
				System.out.println("-----------------------------------------------\n");
		 }else {
			 System.out.print("Incorrect pin \n");
			 Bank();
		
		 }
		 
	}
		
	
public void checkBalance() {
	input = in.nextInt();
	if (input == 1) //to check balance
		{
		System.out.println("Your balance is= " + balance);
		System.out.println("-----------------------------------------------");
		newTransaction();
	}else if (input == 2)//to deposit 
	{
		System.out.println("HOW MUCH DO YOU WANT TO DEPOSIT");
		double amount;
		amount = in.nextDouble();	
	    balance += amount;
	    System.out.println("You just deposited \n:" + amount + "Your new balance is " + balance);
		System.out.println("-----------------------------------------------");
       newTransaction();
    }
	   else if(input ==3)//to withdraw
	   {
	   System.out.print("Enter amount to withdraw \n");
	   double withdraw;
	   withdraw = in.nextDouble();
	   if(withdraw > balance) {
		   System.out.println("Insufficient fund");
	   }else if(withdraw < balance) {
		   balance = balance - withdraw;//Subtracting balance from the amount withdrawn
		 
		   System.out.println("Your new balance is \n" + balance);//the balance is updated 
		   
	   }
	   }else if(input ==4) {
		   System.out.print("Enter your current pin \n");//your initial pin
		   int currentpin;
		   currentpin = in.nextInt();
		   if(currentpin == pin) {
			   int newpin;
			 System.out.println("Enter New Pin \n");
			   newpin = in.nextInt();
			   pin = newpin;
			 System.out.println("Your new pin is " + pin);//the initial pin is changed and updated
			 newTransaction();
		   
		   }else {
			   System.out.println("incorrect pin");
			   newTransaction();
		   }
		   
	   }
	   
	else {
		System.out.println("you have not made a valid selection");	
	}
		
}

public void newTransaction() {
	
	String option_one;
	 Scanner element = new Scanner (System.in);
	System.out.println("DO YOU WISH TO PERFORM A NEW TRANSACTION?"+ "\n" +" ENTER YES" +"\n" + " ENTER NO");
	System.out.println ("********************************* \n");
	option_one = element.nextLine();
	if(option_one.equals("YES" )){
		System.out.println ("********************************* \n");
		Atm a = new Atm();
		a.Bank();
		a.checkBalance(); 
	}else {
		System.out.print("THANK YOU FOR BANKING WITH US.");
	}
}

	//constructor.
	public static void main(String[]args) {
		Atm a = new Atm();
		a.Bank();
		a.checkBalance();
    }
}
