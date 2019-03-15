package javaBasics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapConcept {
	static String str = "Cunning fox attacks lazy dog";
	
	public static void main(String[] args) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}

		//System.out.printf(  " %s : %d %n" ,  entry.getKey(), entry.getValue() 
		System.out.println(map);
		
		System.out.println("*************");
		
	        String aa = "Protijayi Gini";
	        String[] stringarray = aa.split("");

	    Map<String , Long> map1 =  Arrays.stream(stringarray)
	    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	        map1.forEach((k, v) -> System.out.println(k + " : "+ v));
	    }
	

}
