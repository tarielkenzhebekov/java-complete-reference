public class OverloadingVarargsMethods{

	static void vaTest(boolean ... v){
		System.out.print("vaTest(boolean) length: " + v.length + " Contents: " );

		for(boolean i : v)
			System.out.print(i + " ");
		System.out.println();
	}

	static void vaTest(String ... v){
		System.out.print("vaTest(String) length: " + v.length + " Contents: " );

		for(String i : v)
			System.out.print(i + " ");
		System.out.println();
	}

	static void vaTest(int ... v){
		System.out.print("vaTest(int) length: " + v.length + " Contents: " );

		for(int i : v)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		vaTest(true, false, true);
		String[] arr2 = {"one", "two", "three"};
		vaTest(arr2); // you can pass an array
		vaTest(1, 2);

		// vaTest(boolean) length: 3 Contents: true false true 
		// vaTest(String) length: 3 Contents: one two three
		// vaTest(int) length: 2 Contents: 1 2 
	}
}
