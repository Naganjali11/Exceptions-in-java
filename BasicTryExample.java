package com.codegnan.exceptions;

public class BasicTryExample {

	public static void main(String[] args) {
		try {
			System.out.println("inside try block line-1");
		@SuppressWarnings("unused")
		int result=10/0;
		System.out.println("inside try block line-2");

		}catch(ArithmeticException e) {
			System.out.println("Exception caught. Division by Zero");
		}
		System.out.println("Program ends Normally");

	}

}
