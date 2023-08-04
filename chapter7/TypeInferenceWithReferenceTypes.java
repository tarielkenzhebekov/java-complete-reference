import java.util.Scanner;

class MyClass{

	MyClass(){
		System.out.println("MyClass class object has been created.");
	}
}

public class TypeInferenceWithReferenceTypes{
	public static void main(String[] args) {

		// using var with a built-in classes
		var str = "This is a String object";
		var scn = new Scanner(System.in); 

		// It works but avoid doing like this for the sake of readability
//		 var x = scn.next();
//		 System.out.println(x);
		 scn.close();

		// using var with a custom class
		var obj = new MyClass();


		// MyClass class object has been created.

	}
}
