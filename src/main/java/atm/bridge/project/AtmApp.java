package atm.bridge.project;

import java.util.Scanner;

public class AtmApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Atm myAtm = new Atm(500, "1111");

		System.out.println("Enter your PIN");
		String enteredPin = input.nextLine();

		if (myAtm.getPin().equals(enteredPin)) {
			System.out.println("welcome to the bank of We Can Code IT!");
		}

		System.out.println("Choose an option:");
		System.out.println("Type 1 to deposit");
		System.out.println("Type 2 to withdraw");
		System.out.println("Type 3 to check balance");
		System.out.println("Type 4 to exit");
		String menuOption = input.nextLine();

		while (!menuOption.equals("4")) {

			if (menuOption.equals("1")) {
				System.out.println("Enter a deposit amount:");
				int amountDeposit = Integer.parseInt(input.nextLine());
				myAtm.deposit(amountDeposit);
			} else if (menuOption.equals("2")) {
				System.out.println("Enter a withdrawal amount:");
				int amountWithdraw = Integer.parseInt(input.nextLine());
				myAtm.withdraw(amountWithdraw);

			} else if (menuOption.equals("3")) {
				System.out.println("The balance is " + myAtm.getBalance());
			} else {
					System.exit(0);
			}

			System.out.println("Choose another option:");
			System.out.println("Type 1 to deposit");
			System.out.println("Type 2 to withdraw");
			System.out.println("Type 3 to check balance");
			System.out.println("Type 4 to exit");
			menuOption = input.nextLine();
			
			input.close();

	}
}
}
