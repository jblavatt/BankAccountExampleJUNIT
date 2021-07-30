//JB2021

import java.util.ArrayList;

public class Bank {
	private String bankName;
	public ArrayList<BankAccount> clients = new ArrayList<BankAccount>();
	
	public Bank(String bankName, ArrayList clients) {
		this.bankName = bankName;
    	this.clients = clients;
	}
	
	public String toString() {		
		return "Welcome to "+ this.bankName + " Bank our clients are " + clients;
	}
	
	public String getName() {
		return this.bankName;
	}

}

