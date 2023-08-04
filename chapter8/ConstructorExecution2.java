class A{
	int a;

	// The constructors are executed in order of derivation.
	A(int a){
		this.a = a; // a = 1

		System.out.println("Inside A's contructor. a = " + this.a);
	}
}

class B extends A{
	int b;

	B(int a, int b){
		super(a);
		this.b = super.a * b; // b = 1 * 2

		System.out.println("Inside B's contructor. b = " + this.b);
	}
}

class C extends B{
	int c;

	C(int a, int b, int c){
		super(a, b);
		this.c = super.a * super.b * c; // c = 1 * 2 * 3

		System.out.println("Inside C's contructor. c = " + this.c);
	}
}

public class ConstructorExecution2{
	public static void main(String[] args) {
		C c = new C(1, 2, 3);

		// Inside A's contructor. a = 1
		// Inside B's contructor. b = 2
		// Inside C's contructor. c = 6
	}
}
