package mypack;

public class Balance{
	String name;
	double bal;

	public Balance(String name, double bal){
		this.name = name;
		this.bal = bal;
	}

	public void show(){
		System.out.println(name + ": $" + bal);
	}
}