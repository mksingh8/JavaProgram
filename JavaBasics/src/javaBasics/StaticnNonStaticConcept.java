package javaBasics;

public class StaticnNonStaticConcept {
	
	String name = "Tom";
	static int age = 25;

	public static void main(String[] args) {
		//how to call static method and variables
		//1. Direct calling;
		//2. calling by class name
		
		sum();
		StaticnNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticnNonStaticConcept.age);
		
		//how to call non-static method or variables
		
		StaticnNonStaticConcept obj = new StaticnNonStaticConcept();
		
		obj.sendMail();
		System.out.println(obj.name);

	}
	
	public void sendMail() {//non static method
		
		System.out.println("Send email method");
	}
	
	public static void sum() {//static method
		System.out.println("sum method");
	}

}
