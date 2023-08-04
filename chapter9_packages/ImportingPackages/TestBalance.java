// Importing Packages

// In Java source file, import statements occur immediately
// following the package statement (if it exists) and before
// any class definitions

// If a class with the same name exists in two different packages that you
// import using the star form, the compiler will remain silent, unless you try
// to use one of the classes. In that case, you will get compile-time error and
// have to explicitly name the class specifying its package.

// Illegal: you can't import two classes with the same name.
// One of them should have fully qualified name.
// import java.util.Date;
// import java.sql.Date;

// import statement is optional.

// java.lang is imported by the compiler for all programs.

import mypack.*;

class TestBalance{
	public static void main(String[] args) {
		
		// Because Balance is public, you may use Balance
		// class and call its constructor and method.

		Balance test = new Balance("J.P. Morgan", 200.0);

		test.show(); // J.P. Morgan: $200.0

	}
}