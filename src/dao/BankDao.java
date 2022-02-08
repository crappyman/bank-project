import java.util.List;

import pojo.BankEmployeePojo;
import pojo.BankPojo;

public interface BankDao {
	// create a list of customer name
	List<BankPojo> allCustomer();

	// create a list of employee name
	List<BankEmployeePojo> allEmployee();

	// to create a customer account
	BankPojo addAccount(String name, String passWord, String ssN);

	// to check the exist of the customer account
	BankPojo fetchCAcc(int customerid);

	// to check the exist of the Employee account

	BankEmployeePojo fechEAcc(String employeeName, int employeeID);

	BankPojo fechBlance();

	// to withdrawal
	BankPojo fechWithdawel(float mony);

	// to deposit money
	BankPojo depositMoney(float monye);

}
