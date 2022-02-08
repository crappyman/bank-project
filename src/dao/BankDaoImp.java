package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pojo.BankPojo;

public class BankDaoImp implements BankDao {

	List<BankPojo> allCustomer;
	List<BankPojo> allEmployee;
	
	public BankDaoImp() {
		allCustomer=new ArrayList<BankPojo>();
		allCustomer.add( 101,"Daria", "39999");
		allCustomer.add(102,"Bob","895354");
		allCustomer.add(103,"Samanta","575574");
		allEmployee=new ArrayList<BankPojo>();
		allEmployee.add(2344,"jon");
		allEmployee.add(59696,"dan");
		allEmployee.add(856,"roby");
		
	}

	@Override
	public List<BankPojo> allCustomer() {
		return allCustomer;
	}

	@Override
	public List<BankPojo> allEmployee() {
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
	public BankPojo fechEAcc(String employeeName, int employeeID) {
		
		BankPojo returnEBankPojo=null;
		Iterator<BankPojo> itr = allEmployee.iterator();
		while(itr.hasNext()) {
			BankPojo bankE = itr.next();
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