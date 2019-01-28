package com.simple.JavaProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String words[] = {"Ram","Laxman","Sita","Dhasrath","Vishwamitra","Menka","Ram","Sita"};
		
		//approach:1 ==> Worse method to identify the duplicates, run 2 for loops
		for(int i=0; i<words.length; i++) {
			for(int j=i+1; j<words.length; j++) {
				if(words[i]==words[j]) {
					System.out.println("Duplicate item is: " +words[i]);
				}
			}
		}
		
		//approach:2 better approach===> hash set
		Set<String> nameSet = new HashSet<String>();
		for(String word: words) {
			if(nameSet.add(word)== false) {
				System.out.println("Duplicate item is==>" +word);
			}
			
		}
		
			
		// approach: 3 implement array-list to count the occurrence of unique strings
				List<String> namesArray = new ArrayList<String>();
				for(String word: words) {
					namesArray.add(word);
				}
				//HashSet only accept collection as parameter, so converted the array, words to ArrayList, namesArray
				Set<String> uniqueCon = new HashSet<String>(namesArray);
				for (String con : uniqueCon) {
			// System.out.println(con + ": " + Collections.frequency(namesArray,con));
					//print all the elements with number of occurrences
					if(Collections.frequency(namesArray, con) !=1) {
						System.out.println("Duplicate item in the list is: ---> " +con);
					}
				}

		
		
		
		
		
		
		
		
		
		

	}

}
