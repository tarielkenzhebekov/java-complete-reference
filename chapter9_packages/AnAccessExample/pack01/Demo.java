// ...AnAccessExample$ 	javac pack01/Demo.java
// ...AnAccessExample$ 	java pack01.Demo

// Demo package pack01.
package pack01;

public class Demo{
	public static void main(String[] args) {

		// Instantiate the various classes in pack01
		Protection p = new Protection();
		Derived d = new Derived();
		SamePackage s = new SamePackage();
	}
}

		// Base contructor.
		// n = 1
		// n_pri = 2
		// n_pro = 3
		// n_pub = 4
		// Base contructor.
		// n = 1
		// n_pri = 2
		// n_pro = 3
		// n_pub = 4
		// Derived contructor.
		// n = 1
		// n_pro = 3
		// n_pub = 4
		// Base contructor.
		// n = 1
		// n_pri = 2
		// n_pro = 3
		// n_pub = 4
		// Same package contructor.
		// n = 1
		// n_pro = 3
		// n_pub = 4