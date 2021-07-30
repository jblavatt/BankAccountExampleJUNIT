//JB2021
public class IndivInvesAccount extends BankAccount {
	private String ownrName;
	private double balance;
	private double limit = 1000;
	
	
	public IndivInvesAccount(String acctName, double bal){
        super(acctName, bal);
        this.balance = bal;
        
    }
	
	public void withdraw(double debit){
		if(debit <= limit ) {
			super.withdraw(debit);
		}else {
			System.out.println("Limit for Withdrawal is "+limit);
		}
		
		
	}
	
	 
	    
	    
	    
	
	
}