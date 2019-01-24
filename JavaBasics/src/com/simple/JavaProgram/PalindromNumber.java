package com.simple.JavaProgram;

public class PalindromNumber {

	public static void isPalindromNumber(int num) {
		int r;
		int sum = 0;
		int t = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (t == sum) {
			System.out.println(t + " is a Palindrom Number.");
		} else {
			System.out.println(t + " is not a Palindrom Number.");
		}

	}

	public static void isPalindromString(String str) {

		if (str != "" && str !=null) {
			StringBuffer eString = new StringBuffer(str);
			StringBuffer rev = eString.reverse();

			String revString = rev.toString();
			//System.out.println("reverse string is: " +revString);
			if (str.equals(revString)) {
				System.out.println(str + " is a Palindrom String");
			} else {
				System.out.println(str + " is not a Palindrom String");
			}

/*
			if(str.equals(eString.reverse().toString())) { 
				System.out.println(str
						+" is a Palindrom String"); 
			}else { System.out.println(str
					+" is not a Palindrom String"); }
*/
		} else {
			System.out.println("Please enter valid string. :P");
		}

	}

	public static void main(String[] args) {

		isPalindromNumber(151);
		isPalindromNumber(1981);
		isPalindromNumber(1991);

		isPalindromString("poop");
		isPalindromString("rat");
		isPalindromString("");

	}

}
