// An interface can be declared a member of a class or another interface.
// Such and interface is called a member interface or a nested interface.

// A nested interface can be declared
// as public, default, protected or private.

// This differs from a top-level interface, which
// must either be declared as public
// or use the default access. 

// When a nested interface is used outside of its
// enclosing scope, it must be qualified by the name
// of the class or interface of which it is a member.


// This class contains a member interface.
class OuterClass{

	// This is a nested interface.
	public interface NestedInterface{
		boolean isNotNegative(int x);
	}
}


// B implements the nested interface.
class ImplementInterface implements OuterClass.NestedInterface{

	public boolean isNotNegative(int x){
		return x<0 ? false : true;
	}
}


public class NestedInterfaces{ // NestedInterfaces
	public static void main(String[] args) {
		
		// Use a nested interface reference
		OuterClass.NestedInterface nestInterfRef = new ImplementInterface();

		if(nestInterfRef.isNotNegative(10))
			System.out.println("Non-Negative.");
		else
			System.out.println("Negative.");


		if(nestInterfRef.isNotNegative(-10))
			System.out.println("Non-Negative.");
		else
			System.out.println("Negative.");

	}
}
