//JB2021
import java.util.ArrayList;
//THIS IS NOT THE JUNIT TEST FILE THIS WAS DONE FOR VISUALIZATION PURPOSES 
public class BankAccountTest {
	public static void main(String[] args) {
		
		
		
		CheckingAccount Mark = new CheckingAccount("Mark", 0);
		
		CorpInvestAccount Lego = new CorpInvestAccount("Lego Corp.", 0);
		
		IndivInvesAccount John = new IndivInvesAccount("John", 0);

		
		ArrayList<BankAccount> clients = new ArrayList<BankAccount>();
		clients.add(Mark);
		clients.add(Lego);
		clients.add(John);
		
		
		Bank PNC = new Bank("PNC", clients);
		
		
		System.out.println(PNC.toString());
		
		System.out.println(Mark.balCheck());
		System.out.println(Lego.balCheck());
		System.out.println(John.balCheck());
		
		Mark.deposit(5000);
		Lego.deposit(50000);
		John.deposit(10000);
		
		System.out.println(Mark.balCheck());
		System.out.println(Lego.balCheck());
		System.out.println(John.balCheck());
		
		Mark.withdraw(5001);
		Mark.withdraw(1000);
		System.out.println("\n"+Mark.balCheck());
		Mark.transfer(Lego, 500);
		System.out.println("\n"+Mark.balCheck());
		System.out.println("\n"+Lego.balCheck());
		
		John.withdraw(1001);
		John.withdraw(500);
		System.out.println("\n"+John.balCheck());
		
		System.out.println(PNC.getName());
		
		
		
		
		
	}

}
