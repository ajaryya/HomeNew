package Strings;

public class StringOne {

	public static void main(String[] args) {
		String str="Hyderabad";
		System.out.println("String length= " +str.length());
		System.out.println("0 index character="+ str.charAt(0));
		System.out.println("d character index value= " + str.indexOf('d'));
		System.out.println("bad is there in str " + str.contains("bad"));
		System.out.println("sub string value = " +str.substring(6,9));
		System.out.println("Upper case "+ str.toUpperCase());
		System.out.println("Lower case "+ str.toLowerCase());
		System.out.println("Hello "+str);
		String str1= "  hi ";
		System.out.println("str1");
		System.out.println(str1.trim());
		
				

	}

}
