//JB2021
public class BankAccount {
   
    private double balance;
    private String ownrName;
       
   
	public BankAccount(String acctName, double bal) {
		this.ownrName = acctName;
    	this.balance = bal;
	}

	public String getName(){
        return ownrName; 
    }
    
    public void setBalance(double newBalance){   	
    	newBalance = newBalance * 1;
        
        balance = (int) newBalance ;
    }
    
    public double getBalance(){
        return balance;
    }

    public void deposit(double credit){
        setBalance(getBalance() + credit);
    }
    
    public void withdraw(double debit){
    	if(this.balance>debit) {
        setBalance(getBalance() - debit);
    	}else{
    		System.out.println(this.ownrName+" Cannot Withdraw Overdraw Amount");    	}
    }
    
    public void transfer(Object o, double trnsfr) {
    	BankAccount b = (BankAccount) o;
    	if (this.balance > trnsfr) {
    		this.withdraw(trnsfr);
    		b.deposit(trnsfr);
    	}else{
    		System.out.println(this.ownrName+" Cannot Transfer Overdraw Amount");
    	}
    }
    
    public String toString() {
    	return getName();
    	
    	
    }
    public String balCheck() {
    	return getName()+"'s account has " +getBalance();
    }
    
     

  
   
       
   } 
    
    
    
    
    

