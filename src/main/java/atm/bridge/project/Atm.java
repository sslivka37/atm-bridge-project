package atm.bridge.project;

public class Atm {

	private int balance;
	private String requiredPin;

	public Atm(int balance, String requiredPin) {
		this.balance = balance;
		this.requiredPin = requiredPin;
	}

	public int getBalance() {

		return balance;
	}
	
	public String getPin() {
		return requiredPin;
	}

	public void withdraw(int amountWithdraw) {
		if (balance > amountWithdraw) {
			balance -= amountWithdraw;

		} else {
			balance -= balance;
		}
	}

	public void deposit(int amountDeposit) {
		balance += amountDeposit;
		
	}

	public boolean allowAcess(String enteredPin) {
		if (requiredPin.equals(enteredPin)) {
			return true;
		} else {
		return false;
		
	}

	}
	
}
