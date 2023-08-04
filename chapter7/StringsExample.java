public class StringsExample{
	public static void main(String[] args) {
		// Every string you create is actually an object of type String.
		System.out.println("Hello World!");
		// "Hello World!" is a String object

		// Strings are immutable.
		String str = "Jetbrains";
		// str[0] = "G"; // error: array required, but String found

		// an array of strings:
		String[] strArr = {"one", "two", "three"};

		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}


		// Hello World!
		// one two three
	}
}
