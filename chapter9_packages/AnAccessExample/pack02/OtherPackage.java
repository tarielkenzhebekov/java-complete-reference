package pack02;

class OtherPackage{
	OtherPackage(){
		pack01.Protection p = new pack01.Protection();

		System.out.println("Other package constructor.");

		// class or package only
		// System.out.println("n = " + p.n);

		// class only
		// System.out.println("n_pri = " + p.n_pri);

		// class, subclass or package only
		// System.out.println("n_pro = " + p.n_pro);

		System.out.println("n_pub = " + p.n_pub);

	}
}