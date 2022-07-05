package Strings;
/*
 * using string split method
 */

public class StringSplit {

	public static void main(String[] args) {
		
		String stringOne="AjaryyaBonam";
		System.out.println(stringOne);
		
		String[] array=stringOne.split("a",4);		
		
		System.out.println(array);
		
		for(String stringTwo : array)
		{
			System.out.println(stringTwo);
		}

	}

}
