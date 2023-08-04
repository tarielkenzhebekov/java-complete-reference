class Outer2 {
	int outerVar = 10;

	void display(){

		for (int i = 0; i < 5; i++){
			class Inner{
				
				void test(){
					System.out.println("Inner class: " + outerVar);
				}
			}
			Inner inner = new Inner();
			inner.test();
		}
	}
}

public class InnerClass2{
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.display();

		// Inner class: 10
		// Inner class: 10
		// Inner class: 10
		// Inner class: 10
		// Inner class: 10
	}
}
