package com.simple.JavaProgram;

public class PrimeNumber {
	static int num;
	public static boolean isPrimeNumber(int num) {
		if(num < 1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println("1 is primenumber: " +isPrimeNumber(1));
		System.out.println("2 is primenumber: " +isPrimeNumber(2));
		System.out.println("3 is primenumber: " +isPrimeNumber(3));
		System.out.println("4 is primenumber: " +isPrimeNumber(4));
		System.out.println("5 is primenumber: " +isPrimeNumber(5));

	}

}
