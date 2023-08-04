public class Varargs{

	static void vaTest(int ... v){ // v is an array
		System.out.print("Number of args: " + v.length + " Contents: ");

		for(int i : v)
			System.out.print(i + " ");
		System.out.println();
	}

	// illegal: varargs must be last
	// static void vaTest2(int ... v, int b)

	// illegal: there should be only one varargs
	// static void vaTest2(int ... v1, int ... v2)

	static void vaTest2(String msg, int ... v){
		System.out.print(msg + "Contents: ");

		for(int i : v)
			System.out.print(i + " ");
		System.out.println();
}


	public static void main(String[] args) {
		vaTest(1,2,3,4,5);
		vaTest(1,2,3);
		vaTest();

		// Number of args: 5 Contents: 1 2 3 4 5 
		// Number of args: 3 Contents: 1 2 3 
		// Number of args: 0 Contents:

		vaTest2("Four varargs. ", 1, 2, 3, 4);
		vaTest2("No varargs. ");

		// Four varargs.  Contents: 1 2 3 4 
		// No varargs.  Contents:  
	}
}
