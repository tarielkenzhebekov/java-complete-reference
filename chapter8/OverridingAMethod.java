class A{
	int a;

	A(int a){
		this.a = a;
	}

	void show1(){
		System.out.println("a = " + a);
	}

	void show2(){
		System.out.println("a = " + a);
	}
}

class B extends A{
	int b;

	B(int a, int b){
		super(a);
		this.b = b;
	}

	// Override show1()
	void show1(){
		System.out.println("b = " + b);
	}

	// Overload show2()
	void show2(String msg){
		System.out.println(msg + b);
	}
}

public class OverridingAMethod{
	public static void main(String[] args) {
		B objB = new B(1, 2);

		objB.show1();

		// b = 2

		objB.show2();
		objB.show2("b = ");

		// a = 1
		// b = 2

	}
}
	