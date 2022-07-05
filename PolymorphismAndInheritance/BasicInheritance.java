package PolymorphismAndInheritance;

import java.util.Scanner;

public class BasicInheritance {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean simcard;
		System.out.println("choose sim yes or no");
		simcard=sc.nextBoolean();
		if(simcard)
		{
			System.out.println("simcard is there");
		}

	}

}
