class TestStack{
	private int[] values;
	private int tos;

	TestStack(final int size){
		values = new int[size];
		tos = -1;
	}

	void push(int val){
		if(values.length-1 == tos){
			System.out.println("Stack overflow.");
		}
		else
			values[++tos] = val;
	}

	void pop(){
		if(tos < 0)
			System.out.println("Stack underflow.");
		else
			System.out.println(values[tos--]);
	}

}

public class Stack{
	public static void main(String[] args) {
		TestStack stack = new TestStack(5);

		for (int i = 1; i <= 5; i++) {
			stack.push(i);
		}

		stack.push(6);

		for (int i = 0; i < 5; i++) {
			stack.pop();
		}

		stack.pop();

		// Stack overflow.
		// 5
		// 4
		// 3
		// 2
		// 1
		// Stack underflow.
		
	}
}
