class Parent{
	private int a;
	private int b;

	Parent(int a, int b){
		this.a = a;
		this.b = b;
	}

	Parent(int c){
		a = b = c;
	}

	Parent (Parent obj){
		this.a = obj.a;
		this.b = obj.b;
	}

	void getab(){
		System.out.print("a = " + a + " b = " + b + " ");
	}

}

class Child extends Parent{
	private int c;

	Child(int a, int b, int c){
		// super() must always be the first statement
		// executed inside a subclass constructor

		// super() calls the constructor of the immediate parent class
		super(a, b);
		this.c = c;
	}

	Child(int c){
		super(c);
		this.c = c;
	}

	Child(Child obj){

		// An object of type Child is passed to Parent(Parent obj) contructor
		// because a superclass variable can reference a subclass object
		super(obj);
		this.c = obj.c;
	}

	void getc(){
		System.out.println("c = " + c);
	}

}

public class SuperAsAConstructor{
	public static void main(String[] args) {
		Child ch1 = new Child(1, 2, 3);
		Child ch2 = new Child(10);
		Child ch3 = new Child(ch1);

		ch1.getab();
		ch1.getc();

		ch2.getab();
		ch2.getc();

		ch3.getab();
		ch3.getc();

		// a = 1 b = 2 c = 3
		// a = 10 b = 10 c = 10
		// a = 1 b = 2 c = 3

	}
}
