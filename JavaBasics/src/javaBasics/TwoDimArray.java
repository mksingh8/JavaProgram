package javaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		// 2D array
		String x[][] = new String[3][5];
		System.out.println(x.length);
		System.out.println(x[0].length);
		
		//1st row
		x[0][0] = "A0";
		x[0][1] = "B0";
		x[0][2] = "C0";
		x[0][3] = "D0";
		x[0][4] = "E0";
		
		//2nd row
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";

		//3rd row
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";
		
		System.out.println(x[1][2]);
		
		//print all the values of 2d array: use for loop: 2 - 1 is for row and another is for width
		//execution flow: row = 0, then col 0-4
		//row = 1, col 0-4
		//row = 2, col 0-4
		for(int row=0; row<x.length;row++) {
			for (int col=0; col<x[0].length; col++) {
				System.out.println(x[row][col]);
			}
		}
		

	}

}
