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
			System.out.println("\t Chase  Bank Management System");
			System.out.println("*************************************");
			System.out.println("1. Create Account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Display Account Details");
            System.out.println("0. to quit: \n");
            System.out.print("Enter Your Choice : ");
          int  userChoice = scan.nextInt();
          scan.nextLine();
          System.out.println("*************************************");
          switch (userChoice) {
                
          case 1:
        	  BankPojo newAcc=new BankPojo();
          System.out.println("Enter Your Full Name :");
          newAcc.setCustomerName(scan.next());
          
          System.out.println("Enter Your PassWord :");
          newAcc.setPassWord(scan.next());
          
          System.out.println(" Enter Your Money you Want To Put In Your Account :");
          newAcc.setDeposit(scan.nextLong());
          
          BankPojo addAcco = bankService.addAccount(newAcc);
          System.out.println("Account Added Successfully!!\nYour new Account  is " + addAcco.getCustomerID());
          System.out.println("Your Money Blance is "+addAcco.getDeposit() );
      break;
          
          case 2:
        	  System.out.println("Enter your Account  Number");
			int accN = scan.nextInt();
			BankPojo fechaCustomer = bankService.fetchCAcc(accN);
			if(fechaCustomer == null) {
				System.out.println("Please enter a valid Account Number !");
				 break;
			}
				 System.out.println("Enter the Monye  that you want to Deposit: ");
			  double updatmony = scan.nextLong();
			BankPojo fecNewBlance=bankService.fechWithdawel(updatmony);
			System.out.println("Your New Balance Is"+fecNewBlance.getBlance());
			break;
				
          case 3:
        	  break;
          case 4:
        	  System.out.println("please enter your Account Number");
          int  accN2 = scan.nextInt();
          BankPojo blanse=bankService.fechBlance(accN2);
          if(blanse == null) {
				System.out.println("Please enter a valid Account Number !");
          }
          System.out.println("Your Money Blance is "+blanse.getBlance());
				 break;
         
	
         
          case 0:

				System.out.println("************************************");
				System.out.println("Exiting System....");
				System.out.println("Thankyou for using Bank Management System");
				System.out.println("************************************");
				System.exit(0);
	
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
}