import java.util.List;

import pojo.BankEmployeePojo;
import pojo.BankPojo;

public interface BankDao {
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

	BankPojo fechBlance(String name);

	// to withdrawal
	BankPojo fechWithdawel(double mony);

	// to deposit money
	BankPojo depositMoney(double monye);

}
