package atm.bridge.project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AtmTest {

	@Test
	public void shouldHaveDefaultBalanceof100() {
		Atm testAtm = new Atm(100, "1234");
		int balance = testAtm.getBalance();
		assertEquals(100, balance);
	}

	@Test
	public void shouldHaveDefaultBalanceof200() {
		Atm testAtm = new Atm(200, "");
		int balance = testAtm.getBalance();
		assertEquals(200, balance);

	}

	@Test
	public void shouldHaveBalanceOf100AfterWithrawalOf100() {
		Atm testAtm = new Atm(200, "");
		testAtm.withdraw(100);
		int balance = testAtm.getBalance();
		assertEquals(100, balance);

	}

	@Test
	public void shouldHaveBalanceOf0AfterWithrawalOf300() {
		Atm testAtm = new Atm(200, "");
		testAtm.withdraw(300);
		int balance = testAtm.getBalance();
		assertEquals(0, balance);
	}

	@Test
	public void shouldHaveBalanceOf300AfterDepositOf100() {
		Atm testAtm = new Atm(200, "");
		testAtm.deposit(100);
		int balance = testAtm.getBalance();
		assertEquals(300, balance);
	}
	
	@Test
	public void shouldAccessWithPIN() {
		Atm testAtm = new Atm(200, "1234");
		boolean access = testAtm.allowAcess("1234");
		assertTrue(access);
		
		
	}
	
	
	@Test
	public void shouldDenyWithPIN() {
		Atm testAtm = new Atm(200, "1234");
		boolean access = testAtm.allowAcess("1235");
		assertFalse(access);
		
	
	}	
	
}

