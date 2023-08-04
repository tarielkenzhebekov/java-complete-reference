// When working with inheritance, the inferred type is the declared
// type of the initializer, which may not be the most derived type of
// the object being referred to by the initializer.

class Base{

}

class First extends Base{
	int x;
}

class Second extends First{
	int y;
}


public class TypeInferenceAndInheritance{

	// Return some object of type Base
	static Base getObj(int n){
		switch(n){
			case 0: return new Base();
				// Base obj = new Base();
			case 1: return new First();
				// Base obj = new First();
			default: return new Second();
				// Base obj = new Second();
		}
	}

	public static void main(String[] args) {	

		// A Base object is returned.
		var obj1 = getObj(0);

		// A First object is returned.
		var obj2 = getObj(1);

		// A Second object is returned.
		var obj3 = getObj(2);


		// Even though getObj() returns different types of objects,
		// its declared return type is Base. As a result,
		// in all three cases shown here, the type of the variable
		// is inferred to be Base. Because of this, neither obj2 nor obj3
		// can access the fields declared by First and Second.

		// obj2.x = 10; // Wrong! Base doesn't have an x field.
		// obj3.y = 20; // Wrong! Base doesn't have an y field.


		// Here is a simple example to understand the concept more easily

		Base b = new First();
		// b.x = 10; // error: cannot find symbol x
		var v = b;
		// v.x = 10; // error: cannot find symbol x
	}
}
