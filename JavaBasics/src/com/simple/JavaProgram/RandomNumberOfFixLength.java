package com.simple.JavaProgram;

import java.util.Random;

public class RandomNumberOfFixLength {
	
	//exact character length, we have to avoid values with 0 in-front.
	String GenerateRandomNumber(int charLength) {
		return String.valueOf(charLength < 1 ? 0 : new Random().nextInt((9 * (int) Math.pow(10, charLength - 1)) - 1)
						+ (int) Math.pow(10, charLength - 1));
		//(condition)?(true branch):(false branch)
	}

	public static void main(String[] args) {
		
		RandomNumberOfFixLength obj = new RandomNumberOfFixLength();
		for(int i=0; i<15; i++) {
		System.out.println(obj.GenerateRandomNumber(9));
		}

	}

}
