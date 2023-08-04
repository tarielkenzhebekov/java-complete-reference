class Box{
	double width;
	double height;
	double depth;

	// It is compulsory constructor
	Box(){
		width = -1;
		height = -1;
		depth = -1;
	}

	// when cube is created
	Box(double len){
		width = height = depth = len;
	}

	// when dimensions specified
	Box(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// when object is passed
	Box(Box obj){
		this.width = obj.width;
		this.height = obj.height;
		this.depth = obj.depth;
	}

	void volume(){
		System.out.println("Volume is: " + (width*height*depth));
	}
}

class BoxWeight extends Box{
	double weight;

	BoxWeight(double width, double height, double depth, double weight){
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.weight = weight;
	}


	void weigh(){
		System.out.println("Weight is " + weight);
	}
}

class BoxColor extends Box{
	String color;

	BoxColor(double width, double height, double depth, String color){
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.color = color;
	}

	void printColor(){
		System.out.println("Color is " + color);
	}
}


public class MultipleSubclasses{
	public static void main(String[] args) {
		BoxWeight boxWeight = new BoxWeight(10, 11, 12, 20.1);
		boxWeight.volume(); // Volume is: 1320.0
		boxWeight.weigh(); // Weight is 20.1

		BoxColor boxColor = new BoxColor(5, 6, 7, "green");
		boxColor.volume(); // Volume is: 210.0
		boxColor.printColor(); // Color is green
	}
}
