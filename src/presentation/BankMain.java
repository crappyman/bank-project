package presentation;

import java.util.Scanner;

import service.BankService;
import service.BankServiceImpl;

public class BankMain {

	public static void main(String[] args) {
		BankService bankService = new BankServiceImpl();
		Scanner scan = new Scanner(System.in);
		char ch = 'y';
		while(ch == 'y') {

			System.out.println("*************************************");
			System.out.println("\tBank Management System");
			System.out.println("*************************************");
			System.out.println("1. Create Account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Display Account Details");
            System.out.println("0. to quit: \n");
            System.out.print("Enter Your Choice : ");
          int  userChoice = scan.nextInt();
          /*    switch (userChoice) {
                
          case 1:
			System.out.println("*************************************");
			System.out.println("Please enter menu option : ");
			int option = scan.nextInt();
			scan.nextLine();*/
			System.out.println("*************************************");
	}

}
}