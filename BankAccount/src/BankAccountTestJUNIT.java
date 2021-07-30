//JB2021
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTestJUNIT {
	CheckingAccount Mark = new CheckingAccount("Mark", 5000);
	CorpInvestAccount Lego = new CorpInvestAccount("Lego Corp.", 50000);
	IndivInvesAccount John = new IndivInvesAccount("John", 10000);

	@BeforeEach
	void setUp() throws Exception {
		CheckingAccount Mark = new CheckingAccount("Mark", 5000);
		CorpInvestAccount Lego = new CorpInvestAccount("Lego Corp.", 50000);
		IndivInvesAccount John = new IndivInvesAccount("John", 10000);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	//CHECKING TESTS 
	//TRANSFER 
	@Test
	void checkTrans() {
		Mark.transfer(Lego, 1000);
		
		assertEquals(Mark.getBalance(),4000);
		
	}
	//DEPOSIT 
	@Test
	void checkDepo() {
		Mark.deposit(1000);
		
		assertEquals(Mark.getBalance(),6000);
	//WITHDRAW	
	}
	@Test
	void checkWith() {
		Mark.withdraw(1500);
		
		assertEquals(Mark.getBalance(),3500);
		
	}	
	//CORP INVEST 
	
	//TRANSFER
	void corpTrans() {
		Lego.transfer(John,75);
		
		assertEquals(Lego.getBalance(),49925);
		
	}
	//DEPOSIT
	@Test
	void corpDepo() {
		Lego.deposit(10000);
		
		assertEquals(Lego.getBalance(),60000);
		
	}
	//WITHDRAW
	void corpWith() {
		Lego.withdraw(30000);
		
		assertEquals(Lego.getBalance(),20000);
		
	}
	
	//INDIV INVEST
	
	
	//TRANSFER
	void indivTrans() {
		John.transfer(Mark,2000);
		
		assertEquals(John.getBalance(),8000);
		
	}
	
	//DEPOSIT
	void indivDeop() {
		John.deposit(2000);
		
		assertEquals(John.getBalance(),12000);
		
	}
	
	//WITHDRAW FAIL >1000
	@Test
	void indivWithFail() {
		John.withdraw(1001);
		assertEquals(John.getBalance(),10000);
	}
	//WITHDRAW PASS <=1000
	void indivWithPass() {
		John.withdraw(999);
		assertEquals(John.getBalance(),9001);
	}


	
}
