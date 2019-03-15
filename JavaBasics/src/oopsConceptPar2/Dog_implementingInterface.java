package oopsConceptPar2;

public class Dog_implementingInterface implements Animal_interface{
	
	

	public static void main(String[] args) {
		Dog_implementingInterface dogObjectRef = new Dog_implementingInterface();
		dogObjectRef.eat();
		dogObjectRef.feeling();
		dogObjectRef.sleep();
		dogObjectRef.voice();
		

	}

	@Override
	public void sleep() {
		System.out.println("This is how Dog sleeps");
	}

	@Override
	public void eat() {
		System.out.println("This is how Dogs eat.");
	}

	@Override
	public void voice() {
		System.out.println("Dog makes noice like bhow bhow!");
	}

	@Override
	public void feeling() {
		System.out.println("Dogs just feel like all living beings!");
	}

}
