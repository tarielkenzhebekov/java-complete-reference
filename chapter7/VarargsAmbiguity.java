public class VarargsAmbiguity{

	static void vaTest(boolean ... v){

		for (boolean i : v)
			System.out.print(i + " ");
		System.out.println();
	}

	static void vaTest(int ... v){
		
		for (int i : v)
			System.out.print(i + " ");
		System.out.println();
	}

	static void vaTest(int n, int ... v){

		System.out.print(n + " ");

		for (int i : v)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		
		// vaTest(); 
		// error: reference to vaTest is ambiguous
		// vaTest(boolean ...) or vaTest(int ...)


		// vaTest(1, 2, 3); 
		// error: reference to vaTest is ambiguous
		// vaTest(int, int ...) or vaTest(int ...)
	}
}
