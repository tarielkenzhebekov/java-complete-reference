// The superclass can have an infinite number of subclasses
class A{
	int a;

	void printA(){
		System.out.println("a = " + a);
	}
}


// You can only specify one superclass (abstract or concrete) 
// for any subclass
class B extends A{
	int b;

	void printB(){
		System.out.println("b = " + b);
	}

	void printSum(){
		// The subclass can access all public members of the superclass
		System.out.println("a + b = " + (a + b));
	}

}

public class Inheritance{
	public static void main(String[] args) {
		A ObjA = new A();
		B objB = new B();

		ObjA.a = 10;
		ObjA.printA(); // a = 10

		objB.a = 20;
		objB.b = 30;
		objB.printA(); // a = 20
		objB.printB(); // b = 30

		objB.printSum(); // a + b = 50
	}
}
