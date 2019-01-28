package javaBasics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("qtp");
		ll.add("selenium");
		ll.add("test");
		ll.add("qtp");
		
		System.out.println(ll);
		
		ll.addFirst("java");
		ll.addLast("auto");
		
		System.out.println(ll);
		
		ll.get(0);
		System.out.println(ll.get(1));
		
		ll.set(0, "c");
		System.out.println(ll.getFirst());
		
		//remove
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("********************");
		
		//iterate 1.using for each loop 2. iterator n while loop
		for(int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		System.out.println("$$$$$$$$$$$$$");
		
		//for each loop
		for(String str: ll) {
			System.out.println(str);
		}
		System.out.println("######################");
		
		//iterator
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
		

	}

}
