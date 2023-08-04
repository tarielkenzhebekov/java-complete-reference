class Outer{
	private int outerVar = 100;

	void outerMethod(){
		System.out.print("Outer Instance Variable: ");
	}

	void test(){

		// An instance of Inner can be created only in the scope of class Outer
		Inner obj = new Inner();
		obj.display();
		System.out.println("Inner Instance Variable: " + obj.innerVar);
	}

	class Inner{ // Inner is a member of Outer
		int innerVar = 50;

		void display(){
			outerMethod();
			System.out.println(outerVar);
		}
	}

	// void printInnerVar(){
	// 	System.out.println(innerVar); // error: innerVar isn't visible here
	// }
}

public class InnerClass{
	public static void main(String[] args) {
		Outer outer = new Outer();

		// Inner inner = new Inner(); // error

		outer.test();
		// Outer Instance Variable: 100

	}
}
