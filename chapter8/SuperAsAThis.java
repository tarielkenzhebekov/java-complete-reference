// The second form of super() acts somewhat like this keyword,
// except that it always refers to the superclass of the subclass
// in which it is used

// super.member
// * member can be either a method or an instance variable
// * member should be public


// Using super to overcome name hiding
class Parent{
	int i;

	void print(){
		System.out.println("Parent class' method.");
	}

}

class Child extends Parent{
	int i; // this i hides i in Parent

	Child(int a, int b){
		super.i = a; // i in superclass
		i = b; // i in subclass
	}

	void print(){
		System.out.println("Child class' method.");
	}

	void show(){
		super.print();
		print();

		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i);
	}
}

public class SuperAsAThis{
	public static void main(String[] args) {
		Child ch = new Child(1, 2);

		ch.show();

		// Parent class' method.
		// Child class' method.
		// i in superclass: 1
		// i in subclass: 2
	}
}
