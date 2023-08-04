// Packages act as containers for classes and other subordinate packages

// The package is both a naming and a visibility control mechanism.

// The package statement simply specifies to which package the classes
// defined in a file belong.

package samplepackage;

// PackageExample is now part of the package samplepackage
// This means that it cannot be executed by itself.

// from the same directory:
// $	java PackageExample			wrong

// from the above directory:
// $	java samplepackage.PackageExample	correct


class Balance{
	String name;
	double bal;

	Balance(String name, double bal){
		this.name = name;
		this.bal = bal;
	}

	void show(){
		System.out.println(name + ": $" + bal);
	}
}


public class PackageExample{
	public static void main(String[] args) {
			Balance current[] = new Balance[3];

			current[0] = new Balance("K. J. Fielding", 123.23);
			current[1] = new Balance("Will Tell", 157.02);
			current[2] = new Balance("Tom Jackson", -12.33);

			for(int i = 0; i < 3; i++) {
				current[i].show();
			}
	}
}
