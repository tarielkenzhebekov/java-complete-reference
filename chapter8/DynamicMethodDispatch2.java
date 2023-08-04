// Using run-time polymorphism.

class Figure{
	double dim1;
	double dim2;

	Figure(double dim1, double dim2){
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	void area(){
		System.out.println("Area for Figure is undefined.");
	}
}


class Triangle extends Figure{

	Triangle(double dim1, double dim2){
		super(dim1, dim2);
	}

	void area(){
		System.out.println("Area of triangle is equal to " + dim1 * dim2 / 2);
	}
}


class Rectangle extends Figure{

	Rectangle(double dim1, double dim2){
		super(dim1, dim2);
	}

	void area(){
		System.out.println("Area of rectangle is equal to " + dim1 * dim2);
	}
}


public class DynamicMethodDispatch2{
	public static void main(String[] args) {
		Figure f = new Figure(10, 10);
		Triangle t = new Triangle(20, 20);
		Rectangle r = new Rectangle(30, 30);

		Figure figRef; // Reference of type Figure

		figRef = f;
		figRef.area();

		figRef = t;
		figRef.area();

		figRef = r;
		figRef.area();

		// Area for Figure is undefined.
		// Area of triangle is equal to 200.0
		// Area of rectangle is equal to 900.0
	}
}
