package oopsConceptPar2;

public class BMW extends Cars{
	
	//when same method is available in both parent and child class with same name and same number of arguments 
	//is called method overriding
	public void start() {//over ridden method
		System.out.println("BMW start method");
	}
	
	public void theftSafety() {
		System.out.println("BMW theftSafety method");
	}

}
