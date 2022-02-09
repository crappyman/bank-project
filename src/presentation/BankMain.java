package presentation;
import java.util.List;
import java.util.Scanner;

import pojo.BankPojo;
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
          switch (userChoice) {
                
          case 1:
        	  BankPojo newAcc=new BankPojo();
          System.out.println("Enter Your Full Name :");
          newAcc.setCustomerName(scan.nextLine());
          
          System.out.println("Enter Your PassWord :");
          newAcc.setPassWord(scan.nextLine());
          
          System.out.println(" Enter Your Money you Want To Put In Your Account :");
          newAcc.setDeposit(scan.nextLong());
          
          BankPojo addAcco = bankService.addAccount(newAcc);
          System.out.println("Account Added Successfully!!\nYour new Account  is " + addAcco.getCustomerID());
          
          
          case2:
          case3:
          case4:
        	  System.out.println("Your Balance is Full Name");
         // BankPojo name = scan.next();
         double blanse  = 0.0;//bankService.fechBlance(name)
			if(blanse ==0.0 ) {
				System.out.println("Please enter a valid Name!");
			//	break;
          //case5:
          case0:

				System.out.println("************************************");
				System.out.println("Exiting System....");
				System.out.println("Thankyou for using Bank Management System");
				System.out.println("************************************");
				System.exit(0);
	break;
		}
		System.out.println("Do you want to continue(y/n) : ");
		ch = scan.next().charAt(0);
		scan.nextLine();

		}
		
		System.out.println("*****************************************");
		System.out.println("Exiting System....");
		System.out.println("Thankyou for using Bank Management System");
		System.out.println("*****************************************");
}
}}