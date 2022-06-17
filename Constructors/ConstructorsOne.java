package Constructors;

public class ConstructorsOne {

	public ConstructorsOne() {
		
		System.out.println("from default constructor");
		
	}
	public ConstructorsOne(int i, int j) {
		this();
		System.out.println("from parameterized constructor :" + (i+j));
		
	}

	public static void main(String[] args) {
		
		ConstructorsOne obj = new ConstructorsOne(10,20);
		

	}

}
