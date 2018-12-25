package javaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();

		h.put("A", "Test");// 0
		h.put("B", "Hello");// 1
		h.put("C", "World");// 2

		System.out.println(h.size());

		h.put(1, 100);// 3
		h.put(2, 200);// 4
		h.put(3, 300);// 5
		h.put(4, 400);// 6

		System.out.println(h.size());

		h.remove(4);
		System.out.println(h.size());

		System.out.println(h.get(1));
		System.out.println(h.get("C"));

		h.put(4, "TOM");

		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(1, 100);
		// h1.put("A", 200);

		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		// h2.put(1, 100);
		h2.put(1, "200");

	}

}
