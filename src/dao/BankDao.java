package dao;

import java.util.List;

import pojo.BankEmployeePojo;
import pojo.BankPojo;

public interface BankDao {
	// create a list of customer name
	List<BankPojo> allCustomer();

	// create a list of employee name
	List<BankEmployeePojo> allEmployee();

	// to let the Employee log in to his Account
	BankEmployeePojo LogInEmp(int emoId,String empName);
	// to check the exist of the customer account
	BankPojo fetchCAcc(int customerid);

	// to check the exist of the Employee account

	BankEmployeePojo fechEAcc( int employeeID);

	BankPojo fechBlance(int customerid);

	// to withdrawal
	BankPojo Withdawel(BankPojo bankPojo);

	//to add an Account

	BankPojo addAccount(BankPojo bankPojo);
	
BankPojo logIN(String name ,String passWord);

BankPojo transfer(double amount, int account);

BankPojo deposit(double amount);



}
