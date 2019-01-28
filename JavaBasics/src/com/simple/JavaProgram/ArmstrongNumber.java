package com.simple.JavaProgram;

public class ArmstrongNumber {

	public static void isArmstrongNumber(int num) {
		int r;
		int cubeSum=0;
		int t=num;
		
		// 153 --> 1+125+27 = 153

			while (num > 0) {
				r = num % 10;
				cubeSum = cubeSum + (r * r * r);
				num = num / 10;
			}
			if (cubeSum == t) {
				System.out.println(t + " is a Armstrong Number.");
			} else {
				System.out.println(t + " is not a Armstrong number.");
			}

	}

	public static void main(String[] args) {
		isArmstrongNumber(153);
		isArmstrongNumber(200);
		isArmstrongNumber(1);
		isArmstrongNumber(0);
		isArmstrongNumber(100);

	}

}
