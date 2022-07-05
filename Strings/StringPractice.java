package Strings;
/*
 * string practice
 */

public class StringPractice {

	public static void main(String[] args) {
		String stringOne="hyderabad";
		String stringTwo="gachibowli";
		
		stringOne=stringTwo;
		
		System.out.println(stringOne);
		System.out.println(stringOne.getClass());
		
		char charArray[]= {'a','j','j','u'};
		System.out.println(charArray);
		
		System.out.println(stringOne.toUpperCase());
		System.out.println(stringOne.replace('a','x'));
		String stringThree="           jddl                              ";
		System.out.println(stringThree.trim());
		System.out.println(stringOne.hashCode());
		
		
//		if(stringOne)
//		{
//			System.out.println(stringOne);
//		}
//		else
//		{
//			System.out.println("can't be done by string");
//		}

	}

}
