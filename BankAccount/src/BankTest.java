//JB2021
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankTest {
	Bank PNC;
	CheckingAccount Mark;
	CorpInvestAccount Lego;
	IndivInvesAccount John;
	
	
	
	@BeforeEach
	void setUp() throws Exception{
		
		CheckingAccount Mark = new CheckingAccount("Mark", 5000);
		CorpInvestAccount Lego = new CorpInvestAccount("Lego Corp.", 50000);
		IndivInvesAccount John = new IndivInvesAccount("John", 10000);
		ArrayList<BankAccount> clients = new ArrayList<BankAccount>();
		clients.add(Mark);
		clients.add(Lego);
		clients.add(John);
		
		PNC = new Bank("PNC", clients);
	}
	@AfterEach
	  void tearDown() throws Exception {
	    
	  }
	
	@Test
	void bankTest() {
		
		String a = PNC.getName();
		String b = "PNC";
		
		
		assertEquals(a,b);
		
	}

	
	
			
	
		



}
	
	


