// Using interface, you can specify what a class must do,
// but not how it does it.

// Interfaces are syntactically similar to classes, but
// they lack instance variables, and, as a general rule,
// their methods are declared without any body.

// Once it is defined, any number of classes can implement an interface. 
// Also, one class can implement any number of interfaces

// To implement an interface, a class must provide the complete set
// of methods required by the interface.

// Interfaces disconnect the definition of methods
// from the inheritance hierarchy.

// Since interfaces are in a different hierarchy from classes,
// it is possible for classes that are unrelated in terms of the class hierarchy
// to implement the same interface.


/* Simplified general form:


	access interface name{
		return-type method-name(parameter-list);
		...

		type final-variable_name = value;
		...

	}

*/


// When no access modifier is included, then default access results,
// and the interface is only available to other members of the package
// in which it is declared.

// When it is declared as public, the interface can be used by code
// outside its package. In this case, the interface must be the only
// public interface declared in the file, and the file must have the same
// name as the interface.

// Methods in an interface are, essentially, abstract methods.

// Variables in an interface are implicitly final and static,
// meaning they cannot be changed by the implementing class.
// They must also be initialized.

// All methods and variables are implicitly public.


/* The general form of a class implementing an interface
	

	class classname [extends superclass] implements interface-1, ...interface-N
	{
		...
	}


*/


// If a class implements two interfaces that declare the same method,
// then the same method will be used by clients of either interface.

// The methods that implement an interface must be declared public.

// Also, the type signature of the implementing method must match
// exactly the type signature in the interface definition.


interface Inter {

	void interfaceMethod(int param);
}

interface SecondInter {

	void interfaceMethod(int param);
}


class Client implements Inter, SecondInter{

	// Implement Inter's and SecondInter's method
	public void interfaceMethod(int p){
		System.out.println("interfaceMethod() called with " + p);
	}

	// Classes that implement interfaces may 
	// also define other members, too.
	void nonInterfaceMethod(){
		System.out.println("Non-interface method is called.");
	}
}


public class Interfaces{
	public static void main(String[] args) {
		Client cli = new Client();

		cli.interfaceMethod(10);  // interfaceMethod() called with 10
		cli.nonInterfaceMethod(); // Non-interface method is called.
	}
}
