package javaBasics;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "100";
		System.out.println("String concatenation: "+x+20);
		
		//String to int conversion
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to Double conversion
		String y = "12.23";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean
		String k = "True";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to String
		int j = 200;
		System.out.println(j+10);
		
		String s = String.valueOf(j);
		System.out.println(s+10);
		
		//number format exception error for input with number and char
		String u = "100A";
		Integer.parseInt(u);
	}

}
