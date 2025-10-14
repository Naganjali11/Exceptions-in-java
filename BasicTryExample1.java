package com.codegnan.exceptions;

public class BasicTryExample1 {

	@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) {
		try {
			int[] numbers= {1,2,3};//3
			int value=numbers[5];//AIOBE			
			int result=10/0;//A.E
			String text=null;
			text.length();//NPE

		}catch(ArithmeticException e) {
			System.out.println("Arithematic Exception : "+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Exception : "+e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("Null Exception : "+e.getMessage());
		}catch(Exception e) {
			System.out.println("Exception caught. Division by Zero");
		}/*catch(ArithmeticException|ArrayIndexOutOfException|NullPointException e){
				System.out.println("Array index exception:"+e.getMessage());
				}catch(Exception e){
		}*/
		//System.out.println(10/0);
		//throw new ArithmeticException("Division By Zero");
		
	}

}
