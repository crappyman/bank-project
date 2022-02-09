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
	public BankPojo addAccount(BankPojo bankPojo) {
		int addACC=allCustomer.get(allCustomer.size()-1).getCustomerID()+1;
		bankPojo.setCustomerID(addACC);
		allCustomer.add(bankPojo);
		
		return bankPojo;
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
	public BankEmployeePojo fechEAcc( int employeeID) {
		
		BankEmployeePojo returnEBankPojo=null;
		Iterator<BankEmployeePojo> itr = allEmployee.iterator();
		while(itr.hasNext()) {
			BankEmployeePojo bankE = itr.next();
			if(bankE.getEmployeeID() == employeeID ) 
				returnEBankPojo = bankE;
		}
		return returnEBankPojo;
		}

	@Override
	public BankPojo fechBlance(String name) {
		
		return null;
	}

	@Override
	public BankPojo fechWithdawel(double mony) {
		
		return null;
	}

	@Override
	public BankPojo depositMoney(double monye) {
		// TODO Auto-generated method stub
		return null;
	}





}