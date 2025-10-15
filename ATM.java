package com.codegnan.exceptions;

public class ATM {
	private double balance;
	private double  pin=9290;
	private int pinAttempts=0;
	
	public boolean verifyPin(int enteredPin) throws InvalidPinException{
		if(enteredPin==pin) {
			pinAttempts=0;
			System.out.println("Acess Granted");
		}else {
			pinAttempts++;
			if(pinAttempts>3) {
				throw new InvalidPinException("Too Many Incorrect Attempts. Access Blocked");
			}else {
				System.out.println("Invalid PIN. Attempts left:" +(3-pinAttempts));
			}
		}
		return false;
	}
public void deposit(double amount) throws InvalidAmountException{
	if(amount<=0||amount%100!=0) {
		throw new InvalidAmountException("Amount Must be Positive And Multiples of 100");
	}
	balance+=amount;
	System.out.println("Deposit Sucessfull. New Balance is:"+balance);
}
public void withdraw(double amount) throws InvalidAmountException,InsuffiecientFundsException{
	if(amount<=0||amount%100!=0) {
		throw new InvalidAmountException("Amount Must be Positive And Multiples of 100");
	}
		if(amount>balance){
			throw new InsuffiecientFundsException("You Cant Withdraw more than your Account Balance");
		}

	balance-=amount;
	System.out.println("Withdrawl Sucessfull. New Balance is:"+balance);
}
public void checkBalance() {
	System.out.println("Current Balance:"+balance);
}
}
