package dao;

import java.util.List;

import pojo.BankEmployeePojo;
import pojo.BankPojo;

public interface BankDao {
	// create a list of customer name
	List<BankPojo> allCustomer();

	// create a list of employee name
	List<BankEmployeePojo> allEmployee();

	// to create a customer account

	// to check the exist of the customer account
	BankPojo fetchCAcc(int customerid);

	// to check the exist of the Employee account

	BankEmployeePojo fechEAcc( int employeeID);

	BankPojo fechBlance(int customerid);

	// to withdrawal
	double fechWithdawel(int customerid,double mony);

	// to deposit money
	BankPojo depositMoney(double monye);
	//to add an Account

	BankPojo addAccount(BankPojo bankPojo);

}
