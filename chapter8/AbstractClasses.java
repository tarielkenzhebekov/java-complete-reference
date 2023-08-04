// You can require that certain methods be overriden by subclasses
// by specifying the abstract type modifier.

// Any class that contains one or more abstract methods must also be
// declared abstract.

// There can be no objects of an abstract class. That is, an abstract class
// cannot be directly instantiated with the new operator.

// Also, you cannot declare abstract contructors, or abstract static methods.

// Any sublass of an abstract class must either implement all of the abstact
// methods in the superclass, or be declared abstract itself.

abstract class AbstractClassA {
	
	abstract int abs(int n);

	// Concrete methods are still allowed in abstract classes
	void concreteMethod(){
		System.out.println("This is a concrete method.");
	}
}

class ConcreteClassB extends AbstractClassA {

	@Override
	int abs(int n){
		if (n < 0)
			n = -n;
		return n;
	}
}

public class AbstractClasses{
	public static void main(String[] args) {
		ConcreteClassB b = new ConcreteClassB();

		System.out.println("Absolute value of -10 is " + b.abs(-10));
		b.concreteMethod();

		// Absolute value of -10 is 10
		// This is a concrete method.
	}
}
