package pojo;

public class BankPojo {
	
	private int customerID;
	private double withdawell;
	private double blance;
	private double deposit=0;
	private String customerName;
	private String customerSSN;
	private String passWord;
	
	
	
	public BankPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankPojo(int customerID, String customerName, String passWord,long  deposit) {

		this.customerID = customerID;
		this.customerName = customerName;
		this.passWord = passWord;
		this.deposit=deposit;

		}





			public int getCustomerID() {
			return customerID;
			}



			public void setCustomerID(int customerID) {
			this.customerID = customerID;
			}



			public String getCustomerName() {
			return customerName;
			}



			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}



			public String getCustomerSSN() {
			return customerSSN;
			}



			public void setCustomerSSN(String customerSSN) {
			this.customerSSN = customerSSN;
			}



			public String getPassWord() {
			return passWord;
			}



			public void setPassWord(String passWord) {
			this.passWord = passWord;
			}



			public double getWithdawell() {
			return withdawell;
			}
			public void setWithdawell(double withdawell) {
				this.withdawell = withdawell;
				}



				public double getBlance() {
				return blance;
				}



				public void setBlance(float blance) {
				this.blance = blance;
				}



				public double getDeposit() {
				return deposit;
				}



				public void setDeposit(long deposit) {
				this.deposit = deposit;
				}
			}
