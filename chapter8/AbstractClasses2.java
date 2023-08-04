abstract class Figure{
	double dim1;
	double dim2;

	Figure(double dim1, double dim2){
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	abstract void area();
}

class Triangle extends Figure{

	Triangle(double dim1, double dim2){
		super(dim1, dim2);
	}

	void area(){
		System.out.println("Area of triangle is " + dim1 * dim2 / 2);
	}
}

class Rectangle extends Figure{
	Rectangle(double dim1, double dim2){
		super(dim1, dim2);
	}

	void area(){
		System.out.println("Area of rectangle is " + dim1 * dim2);
	}
}

public class AbstractClasses2{
	public static void main(String[] args) {

		// Figure f = new Figure(10, 10) // illegal!
		Figure f;
		Triangle t = new Triangle(10, 10);
		Rectangle r = new Rectangle(20, 20);

		// Using run-time polymorphism
		f = t;
		f.area();

		f = r;
		f.area();

		// Area of triangle is 50.0
		// Area of rectangle is 400.0
	}
}
