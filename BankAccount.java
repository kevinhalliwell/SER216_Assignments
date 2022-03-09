/**
 * 
 */
package Week3;
 
/**
 * @author kevinhalliwell
 *
 */
public class BankAccount {
      
	/*
	 * Declare variables 
	 */
	String accountNumber;
    String accountHolder;
    double balance;
    int accountType;
               
	/**
	 * Bank account constructor
	 * @param accountNumber
	 * @param accountHolder
	 * @param balance
	 * @param accountType
	 */         
    public BankAccount(){
    	accountNumber = "None";
        accountHolder = "Unknown";
        balance = 0;
        accountType = 0;
    }
               
    /**
     * Bank account constructor
	 * @param accountNumber
	 * @param accountHolder
	 * @param balance
	 * @param accountType
	 */          
    public BankAccount(String accountNumber, String accountHolder, double balance, int accountType) {
    	super();
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }
 
	/**
	 * @return the account number
	 */
    public String getAccountNumber() {
    	return accountNumber;
    }
 
	/**
	 * @param accountNumber set the account number
	 */
    public void setAccountNumber(String accountNumber) {
    	this.accountNumber = accountNumber;
    }
 
	/**
	 * @return the account holder
	 */
    public String getAccountHolder() {
    	return accountHolder;
    }
 
	/**
	 * @param accountNumber set the account holder
	 */
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
 
	/**
	 * @return the account balance
	 */
    public double getBalance() {
    	return balance;
    } 

	/**
	 * @param accountNumber set the account balance
	 */
    public void setBalance(double balance) {
    	this.balance = balance;
    }
 
	/**
	 * @return the account type
	 */
    public int getAccountType() {
    	return accountType;
	}
 
	/**
	 * @param accountNumber set the account type
	 */
    public void setAccountType(int accountType) {
    	this.accountType = accountType;
	}
 
	/**
	 * @return the account total balance
	 */         
	public double caculateTotalBalance(){
		double totalBalance = 0.0;
		totalBalance = balance + (balance * (getInterestRate() / 100));
		return totalBalance;
	}
	
	/**
	 * @return the account interest rate
	 */  
	public double getInterestRate(){
		double interestRate = 0.0;
		switch (getAccountType()){
		case 1:
			interestRate = 0.5;
			break;
		case 2:
			interestRate = 4.5;
			break;
		case 3:
			interestRate = 1.0;
			break;
		case 4:
			interestRate = 15.0;
			break;
		case 5:
			interestRate = 0.0;
			break;                  
		}
	return interestRate;
	}
}