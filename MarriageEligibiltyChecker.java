package com.codegnan.exceptions;

public class MarriageEligibiltyChecker {
	public void checkEligibility(int age) throws TooOldException, TooYoungException {
		if(age>60) {
			throw new TooOldException("Marriage Cannot be approved. Age is above 60 years");
		}else {
			if(age<18) {
				throw new TooYoungException("Marriage Cannot be approved. Age is below 18 years");
			}else {
				System.out.println("Marriage Approved. Details will be processing soon");
			}
		}
	}

	public static void main(String[] args) {
		MarriageEligibiltyChecker checker=new MarriageEligibiltyChecker();
		try {
			checker.checkEligibility(17);
		}catch(TooOldException | TooYoungException e) {
			e.printStackTrace();
		}

	}

}
