class A{
	int a;

	A(int a){
		this.a = a;
	}

	void getA(){
		System.out.println("a = " + a);
	}
}

class B extends A{
	int b;

	B(int a, int b){
		// If a superclass requires arguments,
		// then all subclasses must pass those arguments.
		// This is true whether or not a subclass needs arguments of its own.
		super(a);
		this.b = b;
	}

	void getAB(){
		System.out.println("a = " + a + " b = " + b);
	}
}

class C extends B{
	int c;

	C(int a, int b, int c){
		super(a, b);
		this.c = c;
	}

	void getABC(){
		System.out.println("a = " + a + " b = " + b + " c = " + c);
	}
}

public class MultilevelInheritance{
	public static void main(String[] args) {

		C objC = new C(1,2,3);

		objC.getA();
		objC.getAB();
		objC.getABC();

		// a = 1
		// a = 1 b = 2
		// a = 1 b = 2 c = 3
		
	}
}
