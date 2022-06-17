package Constructors;

import javax.management.ConstructorParameters;

class Parent {
	Parent() {

		System.out.println("from parent default");

	}

	public Parent(int i, int j) {
		this();
		System.out.println("from parent parameterized");

	}

public class ConstructorTwo extends Parent{

	 ConstructorTwo() {
		super(10,20);
		 System.out.println("from child default constructor");
		
	}
	 public ConstructorTwo(int i, int j) {
		 this();
		 System.out.println("addition of parameters using child class:" + (i+j));
	 }

	public static void main(String[] args) {
		
	
		ConstructorTwo obj= new ConstructorTwo(10,12);
	

	}

}
