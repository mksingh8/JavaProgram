package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		// Dynamic Array --> ArrayList
		// 1. can contain duplicate items
		// indexed data, thus random access/fetching of random element is allowed
		// through index value
		//

		ArrayList ar = new ArrayList();
		ar.add(100);// 0
		ar.add(200);// 1
		ar.add(300);// 2

		System.out.println(ar.size());

		ar.add("Hey Mann");// 3
		ar.add(12.33);// 4
		ar.add(5, "Manish");
		ar.add("Kumar");
		ar.add("Singh");
		System.out.println(ar.size());
		ar.remove("Kumar");
		System.out.println(ar.get(2));
		System.out.println("last element of the array list: " + (ar.get(ar.size() - 1)));

		System.out.println("**************************");

		// to print all the values of ArrayList:use 1. for loop or 2. Iterator
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// limiting the data type in the ArrayList is generic by parameterizing it.
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);
		// ar1.add("Tom");

		ArrayList<String> ar2 = new ArrayList<String>();
		// ar2.add(10);
		ar2.add("Tom");

		// If you are not sure, what kind of data you will store in run time then use E
		ArrayList<E> ar3 = new ArrayList<E>();

		System.out.println();
		// user defined Employee class object
		Employee e1 = new Employee("Amit", 28, "QA");
		Employee e2 = new Employee("Sumeet", 27, "DBA");
		Employee e3 = new Employee("Rehman", 29, "DEV");

		// create arraylist:
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		// use Iterator to traverse the values
		Iterator<Employee> it = ar4.iterator();

		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

		System.out.println();
/*		// there is no point of using if and for loop both to traverse through the array
		// list, better to use while loop
		for (int i = 0; i < ar4.size(); i++) {
			if (it.hasNext()) {
				Employee emp1 = it.next();
				System.out.println(emp1.name);
				System.out.println(emp1.age);
				System.out.println(emp1.dept);
			}
			//System.out.println(ar4.get(i));
		}
*/
		
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Champion");
		al1.add("Is");
		al1.add("here");
		al1.add(".");
		
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sachin");
		al2.add("Is");
		al2.add("a");
		al2.add("Legend.");
		
		/*al1.addAll(al2);
		for(int i=0; i<al1.size(); i++) {
			System.out.print(al1.get(i));
		}
		System.out.println();
		//removeall()
		al1.removeAll(al2);
		for(int i=0; i<al1.size(); i++) {
			System.out.print(al1.get(i));
		}*/
		
		//retainsall() --> intersection of 2 collections
		System.out.println();
		al1.retainAll(al2);
		for(int i=0; i<al1.size(); i++) {
			System.out.print(al1.get(i));
		}
		
		
		
	}

}
