package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pojo.BankEmployeePojo;
import pojo.BankPojo;

public class BankDaoImp implements BankDao {

	List<BankPojo> allCustomer;
	List<BankEmployeePojo> allEmployee;
	
	public BankDaoImp() {
		allCustomer=new ArrayList<BankPojo>();
		
		BankPojo bank1=new BankPojo(101,"Daria", "39999");
		BankPojo bank2=new BankPojo(102,"Bob","895354");
		BankPojo bank3=new BankPojo(103,"Samanta","575574");
		
		
		allCustomer.add(bank1);
		allCustomer.add(bank2);
		allCustomer.add(bank3);
		
		
		allEmployee=new ArrayList<BankEmployeePojo>();
		
		allEmployee.add(new BankEmployeePojo(2344,"jon"));
		allEmployee.add(new BankEmployeePojo(59696,"dan"));
		allEmployee.add(new BankEmployeePojo(856,"roby"));
		
	}

	@Override
	public List<BankPojo> allCustomer() {
		return allCustomer;
	}

	@Override
	public List<BankEmployeePojo> allEmployee() {
		return allEmployee;
	}

	@Override
	public BankPojo addAccount(String name, String passWord, String ssN) {
		int addACC=allCustomer.get(allCustomer.size()-1).getCustomerID()+1;
		BankPojo setCustomerID(addACC);
		allCustomer.add(addACC);
	}

	@Override
	public BankPojo fetchCAcc(int customerid) {
		
		BankPojo returnBankPojo=null;
		Iterator<BankPojo> itr = allCustomer.iterator();
		while(itr.hasNext()) {
			BankPojo bank = itr.next();
			
			if(bank.getCustomerID() == customerid) 
				returnBankPojo = bank;
		}
		return returnBankPojo;
	}

	@Override
	public BankEmployeePojo fechEAcc(String employeeName, int employeeID) {
		
		BankPojo returnEBankPojo=null;
		Iterator<BankEmployeePojo> itr = allEmployee.iterator();
		while(itr.hasNext()) {
			BankEmployeePojo bankE = itr.next();
			if(bankE.getEmployeeID() == employeeID && bankE.getEmployeeName()==employeeName) 
				returnEBankPojo = bankE;
		}
		return returnEBankPojo;
		@Override
		public float fechBlance() 
		{
			float balance=0.0f;
			return balance;
		}

		@Override
		public BankPojo fechWithdawel(float mony) {
			
			
		}

		@Override
		public BankPojo depositMoney(float monye) {
			float monye+=mony.getBlance();
			return BankPojo mony;
					
		}
		
	}

	@Override
	public BankPojo fechBlance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankPojo fechWithdawel(float mony) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankPojo depositMoney(float monye) {
		// TODO Auto-generated method stub
		return null;
	}

}