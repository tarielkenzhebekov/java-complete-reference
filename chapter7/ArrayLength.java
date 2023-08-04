public class ArrayLength{
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		char[] arr3 = {'a', 'b', 'c', 'd', 'e'};
		String[] arr2 = {"one", "two", "three"};
		char[] arr4 = new char[] {'a', 'b'};

		System.out.println(arr1.length); // 10
		System.out.println(arr3.length); // 5
		System.out.println(arr2.length); // 3
		System.out.println(arr4.length); // 2
	}
}