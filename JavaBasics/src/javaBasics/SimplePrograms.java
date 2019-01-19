/**
 * 
 */
package javaBasics;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author manish
 *
 */
public class SimplePrograms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Identification of duplicate characters:");
		String str = "MoodIndigo";
		int cnt = 0;
		char[] a = str.toCharArray();
		System.out.println("Duplicate Characters are: ");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
					cnt++;
					break;
				}
			}
		}
		System.out.println("Duplicate char count: " +cnt);
		
		System.out.println();
		System.out.println("Identification of duplicate words");
		//Identify duplicate words
		String text = "a r b k c d se f g a d f s s f d s ft gh f ws w f v x s g h d h j j k f sd j e wed a d f";
		List<String> list = Arrays.asList((text.split(" ")));
		Set<String> uniqueWords = new HashSet<String>(list);
		
		for(String word: uniqueWords) {
			System.out.println(word+" :"+ Collections.frequency(list, word));
		}
		
		System.out.println();
		//Adding data to ArrayList
		ArrayList<String> names = new ArrayList<>();
		String bob = "bob";
		String nancy = "nancy";
		String jim = "jim";
		String claire = "claire";

		names.add( bob ); 
		names.add( nancy ); 
		names.add( jim );
		names.add( claire );      

		for (String e : names)  
		{  
		 System.out.println(e);  
		} 

		System.out.println("*****************");
		String strEx = "My name is Manish Kumar Singh";
		System.out.println(strEx.charAt(1));
		
		int length = strEx.length(); System.out.println(length);
		String subStringStartEndIndex = strEx.substring(0, 6); System.out.println(subStringStartEndIndex);
		int indexString = strEx.indexOf("Manish"); System.out.println(indexString);
		String subStringStartIndex = strEx.substring(9); System.out.println(subStringStartIndex);
		System.out.println(strEx.compareTo("Manish"));
		System.out.println(strEx.replace("Manish", "Vanish"));
		System.out.println(strEx.replaceAll("Manish", "Shitijh"));
		String ab = strEx.replace(" ", "");
		ab.length();
		System.out.println(strEx.replace(" ", ""));
		
		List<String> stList = Arrays.asList(strEx.split(" "));
		System.out.println(stList.size());
		
		for(String wrds: stList) {
			System.out.println(wrds);
			System.out.println(wrds.charAt(0));
			System.out.print(wrds.charAt(0));
			System.out.println(wrds.substring(0, 2));
		}
		
		System.out.println("#############################");
		List<String> aListArray = new ArrayList<String>();
		System.out.println(aListArray.add(strEx));
		System.out.println(aListArray.get(0));
		
		System.out.println("%%%%%%%%%%%%%%");
		List<String> aListArrayNew = new ArrayList<String>();
		String[] newList = strEx.split(" ");
		for(int i=0; i<6; i++) {
			aListArrayNew.add(newList[i]);
		}
		for(String newWrds: aListArrayNew) {
			System.out.println(newWrds);
		}
		
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		//print date
		Date date = new Date();
		//System.out.println(date.getDate());
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
		System.out.println(formatter.format(date));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
