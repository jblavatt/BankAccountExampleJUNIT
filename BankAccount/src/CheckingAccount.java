//JB2021
public class CheckingAccount extends BankAccount {
	private String acctName;
	private double balance;
	
	
	public CheckingAccount(String acctName, double bal){
        super(acctName, bal);
        this.balance = bal;
        
    }
}
