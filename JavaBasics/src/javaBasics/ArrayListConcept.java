package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());

		ar.add("Hey Mann");//3
		ar.add(12.33);//4
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(2));
		
		System.out.println("**************************");
		
		//to print all the values of ArrayList:use for loop
		
		for (int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);
		//ar1.add("Tom");
		
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		//ar2.add(10);
		ar2.add("Tom");
		
		
		
	}

}
