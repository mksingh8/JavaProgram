package oopsConceptPar2;

public abstract class Person_AbstractClassConcept {
	
	private String name;
	private String gender;
	
	//constructor
	public Person_AbstractClassConcept(String nm, String gen) {
		this.name = nm;
		this.gender = gen;
	}
	
	//abstract method
	public abstract void work();
	
	public String toString() {
		return "Name:"+this.name+ " Gender::"+ this.gender;
	}
	
	/*@Override
	public String toString() {
		return "Name= "+this.name+ "Gender::"+this.gender;
	}*/
	
	public void changeName(String newName) {
		this.name = newName;
	}
	

}
