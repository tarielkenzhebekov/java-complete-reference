// All other classes are subclasses of Object
// That is, Object is a superclass of all other classes.

// This means that a reference of type Object can refer to
// an object of any other class.

// Also, since arrays implemented as classes, a variable of type
// Object can also refer to any array.

// Object defines multiple methods, which means that they are
// available in every object

class CustomClass{

}

public class ObjectClass{
	public static void main(String[] args) {
			Object obj = new Object();
			CustomClass custom = new CustomClass();

			// Class<?> getClass() obtains the class of an object at run-time
			System.out.println(obj.getClass());    // class java.lang.Object
			System.out.println(custom.getClass()); // class CustomClass

			// boolean equals() determines whether one object is equal to another
			System.out.println(custom.equals(obj)); // false

			// int hashCode() returns the hash code associated with the invoking object
			System.out.println(obj.hashCode());    // 622488023
			System.out.println(custom.hashCode()); // 1933863327

			// String toString() returns a string that describes the object.
			// getClass().getName() + '@' + Integer.toHexString(hashCode())
			System.out.println(obj.toString());    // java.lang.Object@251a69d7
			System.out.println(custom.toString()); // CustomClass@7344699f

			// Also, this method is automatically called
			// when an object is output using println();
			System.out.println(obj); // java.lang.Object@251a69d7
			System.out.println(custom); // CustomClass@7344699f
	}
}
