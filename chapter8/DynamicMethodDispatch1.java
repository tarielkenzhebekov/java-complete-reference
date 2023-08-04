// Dynamic Method Dispatch

// When an overriden method is called through a superclass reference,
// Java determines which version of that method to execute based upon
// the type of the object being referred to at the time the call occurs.

class A{
	void print(){
		System.out.println("A");
	}
}

class B extends A{
	void print(){
		System.out.println("B");
	}
}

class C extends B{
	void print(){
		System.out.println("C");
	}
}

public class Temp{

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();

		A ref;

		ref = a;
		ref.print();

		ref = b;
		ref.print();

		ref = c;
		ref.print();

		// A
		// B
		// C
		
	}
}
