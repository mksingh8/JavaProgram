package oopsConceptPar2;

public class testCar {

	public static void main(String[] args) {
		
		//static polymorphism or compile time polyformism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("**************");
		
		//Top casting
		Cars c1 = new BMW();//child class object can be referred by parent class reference variable, called dynamic
		//polymorphism or run-time polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.theftSafety -- only overridden method and methods availavle in the reference variable class can be accessed
		c1.engine();
		
		//Down casting is not allowed, possible by typecasting but throw ClassCastException 
		BMW b1 = (BMW) new Cars();//ClassCastException:
		
		

	}

}
