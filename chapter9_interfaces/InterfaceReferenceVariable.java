// Accessing Implementations Through Interface References

// You can declare variables as object references that use an
// interface rather than a class type.
// Any instance of any class that implements the declared interface
// can be referred to by such a variable.

// This process is similar to using a superclass reference to
// access a subclass object.


interface Inter{
	void interfaceMethod(int param);
}


class Client implements Inter{

	// Implement Inter's interface
	public void interfaceMethod(int p){
		System.out.println("interfaceMethod() called with " + p);
	}

	// Classes that implement interfaces may 
	// also define other members, too.
	void nonInterfaceMethod(){
		System.out.println("Non-interface method is called.");
	}
}


class AnotherClient implements Inter{
	// Implement Inter's interface
	public void interfaceMethod(int p){
		System.out.println("\nAnother version of interfaceMethod().");
		System.out.println(p + " squared is " + (p*p));
	}
}


public class InterfaceReferenceVariable{
	public static void main(String[] args) {
		Inter i = new Client();
		i.interfaceMethod(10);


		// An interface reference variable has knowledge only of the
		// methods declared by its interface declaration.

		// i.nonInterfaceMethod(); // error


		AnotherClient ac = new AnotherClient();

		i = ac; // i now refers to AnotherClient object
		i.interfaceMethod(10);


		// interfaceMethod() called with 10

		// Another version of interfaceMethod().
		// 10 squared is 100

	}
}
