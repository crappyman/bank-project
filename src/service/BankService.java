package service;

import java.util.List;

import pojo.BankEmployeePojo;
import pojo.BankPojo;

public interface BankService {
	// create a list of customer name
		List<BankPojo> allCustomer();

		// create a list of employee name
		List<BankEmployeePojo> allEmployee();

		// to create a customer account
		BankPojo addAccount(BankPojo bankPojo);

		// to check the exist of the customer account
		BankPojo fetchCAcc(int customerid);

		// to check the exist of the Employee account

		BankEmployeePojo fechEAcc( int employeeID);

		BankPojo fechBlance(int customerID);
		// public double getBalance()

		// to withdrawal
		BankPojo Withdawel(BankPojo bankPojo);

		
		///to log in
		 BankPojo logIN(String name ,String passWord);
		 
		 BankEmployeePojo LogInEmp(int emoId,String empName);

}
