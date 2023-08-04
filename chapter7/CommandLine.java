public class CommandLine{
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++){
			System.out.println("args [" + i + "] " + args[i]);

			// $ javac CommandLine.java
			// $ java CommandLine zero one two three
			// args [0] zero
			// args [1] one
			// args [2] two
			// args [3] three

		}
	}
}
