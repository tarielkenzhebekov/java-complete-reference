public class VarargsOldApproach{

	static void vaTest(int v[]){
		System.out.print("Number of args: " + v.length + " Contents: ");
		
		for(int i : v)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3};
		int[] arr3 = {};

		vaTest(arr1);
		vaTest(arr2);
		vaTest(arr3);

		// Number of args: 5 Contents: 1 2 3 4 5 
		// Number of args: 3 Contents: 1 2 3 
		// Number of args: 0 Contents:
	}
}
