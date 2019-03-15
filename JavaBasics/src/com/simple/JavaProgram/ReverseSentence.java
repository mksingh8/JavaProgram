package com.simple.JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class ReverseSentence {
	static String str = "Catch me if you can";

	public static void main(String[] args) {
		// reverse words in a sentence
		System.out.println(str);
		StringBuffer revSentence = new StringBuffer(str);
		System.out.println(revSentence.reverse().toString());
		
		String words[] = str.split(" ");
		for(String word: words) {
			StringBuffer sb = new StringBuffer(word);
			System.out.print(sb.reverse());
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("*************");
		
		//count duplicate char in a string
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		//String str1 = "abcac";
		String str1 = str.toLowerCase();
		for(int i=0; i< str1.length(); i++) {
			char ch = str1.charAt(i);
			if(map.containsKey(ch)) {
				int cnt = map.get(ch);
				map.put(ch, ++cnt);
				
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
		
		System.out.println();
		System.out.println("*************");
		//reverse a number
		int num = 123456789;
		int sum = 0;
		int remainder;
		while (num > 0) {
		remainder = num % 10;
		sum = sum * 10 + remainder;
		num = num/10;
		}
		System.out.println(sum);

	}

}
