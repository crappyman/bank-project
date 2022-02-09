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
			System.out.println("1. Add a new Account");
			System.out.println("2. Update a Bo");
			System.out.println("3. Remove a Book");
			System.out.println("4. Fetch an Account");
			System.out.println("5. Exit");
			System.out.println("*************************************");
			System.out.println("Please enter menu option : ");
			int option = scan.nextInt();
			scan.nextLine();
			System.out.println("*************************************");
	}

}
}