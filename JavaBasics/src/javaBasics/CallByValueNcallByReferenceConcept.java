package javaBasics;

public class CallByValueNcallByReferenceConcept {

	int p;
	int q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValueNcallByReferenceConcept obj = new CallByValueNcallByReferenceConcept();
		int x = 10;
		int y = 20;
		obj.testSum(x, y); //call or pass by Value, copy of x and y are given to a and b

		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);//using object reference
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		
		System.out.println("############");
		int m = obj.testSum(20, 40);
		System.out.println(m);
	}
	
	public int testSum(int a, int b) {
		a = 30;
		b = 40;
		int c = a+b;
		return c;
	}
	//call by reference
	public void swap(CallByValueNcallByReferenceConcept t) {
		int temp;
		temp = t.p;//temp = 50
		t.p = t.q;//p = 60
		t.q = temp;//q = 50
		
	}

}
