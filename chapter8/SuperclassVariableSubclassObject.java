class Square{
	int height;
	int width;
	
	void square(){
		System.out.println("Square is: " + (height * width));
	}
}

class Cube extends Square{
	int depth;

	Cube(int len){
		height = width = depth = len;
	}

	void volume(){
		System.out.println("Volume is: " + (height * width * depth));
	}
}

public class SuperclassVariableSubclassObject{
	public static void main(String[] args) {
		Cube cube = new Cube(3);
		Square sqr = new Square();

		cube.square(); // Square is: 9
		cube.volume(); // Volume is: 27

		// A superclass variable can reference a subclass object
		sqr = cube;

		sqr.square(); // Square is: 9
		// sqr.cube(); // error: cube() isn't defined in Square class
	}
}
