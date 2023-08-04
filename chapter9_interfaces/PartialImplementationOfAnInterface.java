// If a class includes an interface but does't fully
// implement the methods required by that interface,
// then that class must be declared as abstract.

interface Inter{
	void interfaceMethod1();
	void interfaceMethod2();
}

// Here, the class Incomplete doesn't implement 
// interfaceMethod2() and must be declared as abstract.
abstract class Incomplete implements Inter{
	public void interfaceMethod1(){
		System.out.println("The first method's implementation.");
	}
}


// Any class that inherits Incomplete must implement
// interfaceMethod2() or be declared abstract itself.
class Subclass1 extends Incomplete{
	public void interfaceMethod2(){
		System.out.println("The second method's implementation.");
	}
}


abstract class Subclass2 extends Incomplete{
	
}


public class PartialImplementationOfAnInterface{
	public static void main(String[] args) {
		
	}
}