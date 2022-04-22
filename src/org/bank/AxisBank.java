package org.bank;

public class AxisBank extends BankInfo { 
	@Override
	public void deposit() {
		System.out.println("Deposit amount is 15000.00 ");
		System.out.println("Deposit amount is 188000.00 ");
	}

	public static void main(String[] args) {
		AxisBank l = new AxisBank();
		l.deposit();
		l.saving();
		l.fixed();
		

	}

}
