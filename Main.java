package com.codegnan.exceptions;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws InsuffiecientFundsException {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		ATM atm=new ATM();
		boolean authonticated=false;
		while(!authonticated) {
			System.out.println("Enter your Pin");
			int enteredPin=scanner.nextInt();
			try {
				authonticated=atm.verifyPin(enteredPin);
			}catch(InvalidPinException e) {
				System.out.println("InvalidPinException:"+e.getMessage());
			}
		while(true) {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. CheckBalance");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice");
			int choice=scanner.nextInt();
			try {
				switch(choice) {
				case 1:
					System.out.println("Enter Amount to Deposit");
					double depositAmount=scanner.nextDouble();
					atm.deposit(depositAmount);
					break;
				case 2:
					System.out.println("Enter Amount to Withdraw");
					double withdrawAmount=scanner.nextDouble();
					atm.withdraw(withdrawAmount);
					break;
				case 3:
					atm.checkBalance();
					break;
				case 4:
					System.out.println("Thank you for using ATM.");
					return;
					default:
						System.out.println("Invalid choice please choose the correct option.");
				}
		
			}catch(InvalidAmountException e) {
				e.printStackTrace();
			}
		
		}


			}
			
		}

	}



