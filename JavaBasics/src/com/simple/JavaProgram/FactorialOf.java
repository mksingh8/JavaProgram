package com.simple.JavaProgram;

public class FactorialOf {
	
	public static void factorialOfNumber(int num) {
		int product=1; 
		for(int i=1; i<=num; i++) {
			product = product*i;
		}
		System.out.println("Factorial of "+ num +" is: " + product);
	}

	//By using a recursive function
	public static int fact(int num) {
		if(num == 0) {
			return 1;
		} else {
			return (num* fact(num-1));
		}
	}
	
	public static void main(String[] args) {
		factorialOfNumber(0);
		factorialOfNumber(1);
		factorialOfNumber(2);
		factorialOfNumber(3);
		factorialOfNumber(4);
		factorialOfNumber(-4);
		System.out.println();
		

	}

}
