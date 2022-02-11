package pojo;

public class BankPojo {

	private int customerID;
	private String customerLastName;
	private double accounntBlance;
	private String customerFirsttName;
	private String Address;
	private String passWord;
	private String phoneNumber;

	public BankPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankPojo(int customerID, String customerFirsttName, String customerLastName, String passWord,
			double accounntBlance) {

		this.customerID = customerID;
		this.customerFirsttName = customerFirsttName;
		this.customerLastName = customerLastName;
		this.passWord = passWord;
		this.accounntBlance = accounntBlance;

	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public double getAccounntBlance() {
		return accounntBlance;
	}

	public void setAccounntBlance(double accounntBlance) {
		this.accounntBlance = accounntBlance;
	}

	public String getCustomerFirsttName() {
		return customerFirsttName;
	}

	public void setCustomerFirsttName(String customerFirsttName) {
		this.customerFirsttName = customerFirsttName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}