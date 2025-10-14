package com.codegnan.exceptions;

public class BasicTryExample2 {
	public static void riskyMethod()throws ArithmeticException {
		@SuppressWarnings("unused")
		int result= 10/0;		
	}
	public static void main(String[] args) {
		try {
		riskyMethod();
		}catch(ArithmeticException e) {
			System.out.println("Hia");
		}
		
	}

}
