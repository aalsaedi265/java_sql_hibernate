package errorHandel.bankEx;

import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
		
		bankAcc account = new bankAcc();
		Scanner input = new Scanner (System.in);
		int choice;
		do {
			System.out.println("-----BANK ACCOUNT MENU-----");
			System.out.println("1-Deposit");
			System.out.println("2-Withdraw");
			System.out.println("3-Show Current Balance");
			System.out.println("4-Quit");
			System.out.println("Select an option : ");
			choice = input.nextInt();
			switch (choice) {
				case 1 : 
					System.out.println("Deposit Amount : ");
					account.deposit(input.nextInt());
					break;
				case 2 :
					System.out.println("Current Balance : " + account.getBalance());
					System.out.println("Withdraw Amount : ");

					account.withdraw(input.nextInt());
					break;
				case 3 : 
					System.out.println("Current Balance : " + account.getBalance());
					break;
			}// final is the else in the try catch logic
			
		} while (choice != 4);
		System.out.println("Bye..");
				

	}

}
