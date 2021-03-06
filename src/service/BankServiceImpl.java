package service;

import java.util.List;
import dao.BankDao;
import dao.BankDaoImp;
import pojo.BankEmployeePojo;
import pojo.BankPojo;

public class BankServiceImpl implements BankService {
	
	BankDao bankDao;
	BankDao bankEDao;
	
	

	public BankServiceImpl() {
		bankDao=new BankDaoImp();
		bankEDao=new BankDaoImp();
	}

	@Override
	public List<BankPojo> allCustomer() {
		return bankDao.allCustomer();
	}

	@Override
	public List<BankEmployeePojo> allEmployee() {
		return bankEDao.allEmployee();
	}

	@Override
	public BankPojo addAccount(BankPojo bankPojo) {
		return bankDao.addAccount(bankPojo);
	}

	@Override
	public BankPojo fetchCAcc(int customerid) {
		return bankDao.fetchCAcc(customerid);
	}

	@Override
	public BankEmployeePojo fechEAcc(int employeeID) {
		return bankEDao.fechEAcc(employeeID);
	}

	@Override
	public BankPojo  fechBlance(int customerID) 
	{
		
	return bankDao.fechBlance(customerID);
		
	}
	
		 
	 

	@Override
	public BankPojo Withdawel( BankPojo bankPojo) {
		return bankDao.Withdawel(bankPojo);
	}


	@Override
	public BankPojo logIN(String name ,String passWord) {
		return bankDao.logIN(name, passWord);
	}
	public BankEmployeePojo LogInEmp(int emoId,String empName){
		return bankEDao.LogInEmp(emoId, empName);
	}
}

