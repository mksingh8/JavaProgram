package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// array to save similar type of data types
		
		//1. integer array
		//lowest index = 0
		//upper bound is n-1
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println("**********");
		//print all the values of array
		
		for (int j=0; j< i.length; j++) {
			System.out.println(i[j]);
		}

	}

}
