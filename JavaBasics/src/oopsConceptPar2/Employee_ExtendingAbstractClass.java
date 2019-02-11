package oopsConceptPar2;

public class Employee_ExtendingAbstractClass extends Person_AbstractClassConcept {
	
	private int empId;
	
	public Employee_ExtendingAbstractClass(String nm, String gen, int Id) {
		
		super(nm, gen);
		this.empId = Id;
	}

	@Override
	public void work() {
		if(empId == 0) {
			System.out.println("Not Working.");
		} else {
			System.out.println("Currently Working as Employee");
		}	
	}
	
	
	public static void main(String[] args) {
	
		//coding for the abstract class
		Person_AbstractClassConcept student = new Employee_ExtendingAbstractClass("Mariya", "Female", 0);
		Person_AbstractClassConcept employee = new Employee_ExtendingAbstractClass("Rony", "Male", 1);
		student.work();
		employee.work();

		//method implemented in abtract class
		employee.changeName("Ramesh Kumar");
		System.out.println(employee.toString());
	}
	

}
