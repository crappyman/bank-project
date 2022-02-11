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
		
//		BankPojo bank1=new BankPojo(101,"Daria","Hassn", "39999",576.9);
		BankPojo bank2=new BankPojo(102,"Bob","Hada","895354",567);
		BankPojo bank3=new BankPojo(103,"Samanta","Salma","575574",694);
		
		
		allCustomer.add(new BankPojo(101,"Daria","Hassn", "39999",576.9));
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
		int addACCID=allCustomer.get(allCustomer.size()-1).getCustomerID()+1;
		 bankPojo.setCustomerID(addACCID);
		allCustomer.add(bankPojo);
		
		return bankPojo;
	}
	@Override
	public BankEmployeePojo LogInEmp(int emoId,String empName) {
		BankEmployeePojo returnBankPojo=null;
		Iterator<BankEmployeePojo> itr = allEmployee.iterator();
		while(itr.hasNext()) {
			BankEmployeePojo bank = itr.next();
			
			if(bank.getEmployeeID() == emoId || bank.getEmployeeName() == empName) 
				returnBankPojo = bank;
		
		}
		return returnBankPojo;
	
		
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
	public BankPojo  fechBlance(int customerid) {    
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
	public BankPojo fechWithdawel(int customerid,double mony) {
		BankPojo returnBankPojo=null;
		
		Iterator<BankPojo> itr = allCustomer.iterator();
		while(itr.hasNext()) {
			BankPojo bank = itr.next();
			
			if(bank.getCustomerID() == customerid) 
				returnBankPojo = bank;
			
		double	  balance=bank.getAccounntBlance();
		
			balance-=mony;
			
			balance=bank.getAccounntBlance();
			returnBankPojo = bank;
		}
		return returnBankPojo;
	}


	
	@Override
	public BankPojo logIN(String name ,String passWord) {
		BankPojo returnBankPojo=null;
		Iterator<BankPojo> itr = allCustomer.iterator();
		while(itr.hasNext()) {
			BankPojo bank = itr.next();
			
			if(bank.getCustomerFirsttName() == name && bank.getPassWord() == passWord) 
				returnBankPojo = bank;
		
		}
		return returnBankPojo;
	
	}



}