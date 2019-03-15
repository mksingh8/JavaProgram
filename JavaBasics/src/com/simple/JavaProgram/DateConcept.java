package com.simple.JavaProgram;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConcept {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		
		String strDateFormat1 = "hh:mm:ss a dd-MMM-yyyy";
		String strDateFormat2 = "hh:mm a yyyy-MMM-dd";
		SimpleDateFormat dateFormat = new SimpleDateFormat(strDateFormat1);
		SimpleDateFormat dateFormat2 = new SimpleDateFormat(strDateFormat2);
		
		System.out.println(dateFormat.format(date));
		System.out.println(dateFormat2.format(date));

	}

}
