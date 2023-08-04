class A {
	final void method(){
		System.out.println("This is a final method.");
	}

	void method2(){
		System.out.println("This is a method 2.");
	}
}


class B extends A {

	// error: method() in B cannot override method() in A
	// void method(){
	// 	System.out.println("This isn't a final method.");
	// }

	// But you can overload it.
	void method(String msg){
		System.out.println(msg);
	}
	// Only parameters should differ in method overloading.
	// There aren't any requirements for access modifier and return type

	// To override a superclass method, the overriding  method 
	// must have the same signature.
	// The return type must be the same or its subtype.
	// The access modifier should not be weaker
	// than that of the overriden method.
	void method2(){
		System.out.println("This is a final method.");
	}
}

public class FinalToPreventMethodOverriding{
	public static void main(String[] args) {
		
	}
}
