package presentation;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import pojo.BankEmployeePojo;
import pojo.BankPojo;
import service.BankService;
import service.BankServiceImpl;

public class BankMain {

	public static void main(String[] args) {
		BankService bankService = new BankServiceImpl();
		Scanner scan = new Scanner(System.in);
		
char ch  = 'y';
		
		while(ch == 'y') {
		System.out.println("*************************************");
		System.out.println("\t Chase  Bank Wellcome");
		System.out.println("*************************************");
		
		
		System.out.println("Please Enter 1 iF You Are An Employee.");
		System.out.println("Please Enter 2 iF You Are A Customer.");
		
		int emo=scan.nextInt();
		while (emo==1) {
			System.out.println("Hi Please log In");
			System.out.println("Enter Your Account Number");
			int emo1=scan.nextInt();
			System.out.println("Enter Your Name");
			String empName=scan.next();
			BankEmployeePojo empVaildate=bankService.LogInEmp(emo1, empName);
			if(empVaildate == null) {
  				System.out.println("Please enter a valid Account Number !");
  				 break;
  			}
			System.out.println("Wellcome "+empName + "  please Enter Your Choise");
			
			
		      System.out.println("1.Register or Creating A New Customer");
	            System.out.println("2. List all the cusomers");
	             System.out.println("3. to quit: \n");
	            System.out.print("Enter Your Choice : ");
	          int  userChoice2 = scan.nextInt();
	          scan.nextLine();
	          System.out.println("*************************************");
	          switch (userChoice2) {
	                
	          case 1:  BankPojo newAcc=new BankPojo();
	          System.out.println("Enter Your Full Name :");
	          newAcc.setCustomerLastName(scan.next());
	          
	          System.out.println("Enter Your PassWord :");
	          newAcc.setPassWord(scan.next());
	          
	          System.out.println(" Enter Your Money you Want To Put In Your Account :");
	          newAcc.setAccounntBlance(scan.nextLong());
	          
	          BankPojo addAcco = bankService.addAccount(newAcc);
	          System.out.println("Account Added Successfully!!\nYour new Account  is " + addAcco.getCustomerID());
	          System.out.println("Your Money Blance is "+addAcco.getAccounntBlance() );
	      break;
	      
	      
	          case 2:
	        	  List<BankPojo> allCuomer =bankService.allCustomer();
	        	  java.util.Iterator<BankPojo> itr = allCuomer.iterator();
	        	  
	        	  System.out.println("**************************************************************************************");
					System.out.println("ID \t\t\t FiRST NAME \t\t\t\t\tLAST NAME \t\t\t\tBALANCE\t\t\t\t\tPhone NUBER");
					System.out.println("**************************************************************************************");
					while(itr.hasNext()) {
						BankPojo bank = itr.next();
						System.out.println(bank.getCustomerID() + "\t" + bank.getCustomerFirsttName() + "\t" + bank.getCustomerLastName() + "\t" + bank.getAccounntBlance()+ "\t \t"+bank.getPhoneNumber());
					}
					System.out.println("**************************************************************************************");
	        	   break;
	        	   
	          case 3:
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
		
		while (emo==2) {


			System.out.println("*************************************");
			System.out.println("\t Chase  Bank Management System");
			System.out.println("*************************************");
			 System.out.println("please Log IN ");
              System.out.println("please enter your Full Name And Password ");
              String  name =scan.next();
              System.out.println("Enter your PassWord:");
             
              String password=scan.next();
              
              BankPojo name3=bankService.logIN(name, password);
             /* if(name3 == null) {
    				System.out.println("Please enter a valid Account Number !");
    				break;
            }*/
            
                System.out.println("Wellcome "+name);
               
                System.out.print("Enter Your Choice : ");
                System.out.println("1. Transfer Money from anther Account");
               
                System.out.println("2. Deposit money");
                System.out.println("3. Withdraw money");
                System.out.println("4. Check balance And View History");
              
                System.out.println("5.  to quit: \\n");
                int  userChoice = scan.nextInt();
              scan.nextLine();
              System.out.println("*************************************");
                switch (userChoice) {
                
                case 1:
                	
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
			//BankPojo fecNewBlance=bankService.(updatmony);
			//System.out.println("Your New Balance Is"+fecNewBlance.getAccounntBlance());
			break;
				
          case 3:
        	  System.out.println("Enter your Account  Number");
  			int accNn = scan.nextInt();
  			BankPojo fechaCustoumer = bankService.fetchCAcc(accNn);
  			if(fechaCustoumer == null) {
  				System.out.println("Please enter a valid Account Number !");
  				 break;
  			}
  			 System.out.println("Enter the Monye  that you want to Withdrall: ");
  			  double updatmonyy = scan.nextLong();
  			
  			BankPojo fecNewBlancee=bankService.Withdawel( updatmonyy);
  			
  			System.out.println("Your New Balance Is"+fecNewBlancee.getAccounntBlance());
        	  break;
          case 4:
        	  System.out.println("please enter your Account Number");
          int  accN2 = scan.nextInt();
         BankPojo blanse=bankService.fechBlance(accN2);
         
         if(blanse == null) {
			System.out.println("Please enter a valid Account Number !");
			 break;
        }
         
          System.out.println("Your Money Blance is "+blanse.getAccounntBlance());
				 
          
	
         
          case 5: 
        	  System.out.println("************************************");
				System.out.println("Exiting System....");
				System.out.println("Thankyou for using Bank Management System");
				System.out.println("************************************");
				System.exit(0);
			
				
	
		}
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