package package2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WrapperClassDemo {

	//	public static void main(String[] args) {
	//		// Convert primitive to Object
	//		//	
	//		//		int i = 100;
	//		//		i.getClass().getName();
	//
	//		// Option 1 - using constructor
	//		Integer i1 = new Integer(10);
	//		System.out.println(i1.getClass().getName()); //Integer
	//		System.out.println(i1); // 10
	//
	//		// Option 2 - valueOf()
	//		int j = 100;
	//		Integer j1 = Integer.valueOf(j);
	//
	//		float f = 10.40f;
	//		Float f1 = Float.valueOf(f);
	//		System.out.println(f1.getClass().getName());
	//
	//		// Option 3: Autoboxing
	//		Integer k = 200;
	//		System.out.println(k.getClass().getName());//Integer
	//
	//		Double d = 30.45;
	//		System.out.println(d.getClass().getName());// Double
	//
	//
	//		// Wrapper Object to primitive data type
	//		Integer i22 = 100;
	//		System.out.println(i22.getClass().getName());// Integer
	//		int i23 = i22.intValue();
	//		System.out.println(i22+" | "+i23);// 100 100
	//
	//		Double d22 = 20.34;
	//		double d23 = d22.doubleValue();
	//		System.out.println(d22+" | "+d23 );// 20.34 20.34
	//
	//		// AutoUnboxing
	//		int x = i22;
	//		//System.out.println(x.getClass().getName());
	//
	//
	//		System.out.println();
	//		// Convert wrapper object to String object
	//		// toString()
	//		System.out.println(d22.getClass().getName());// Double
	//		String str1  = d22.toString();
	//		System.out.println(str1.getClass().getName());// String
	//
	//		System.out.println();
	//		// Convert primitive to String - valueOf()
	//		String str2 = String.valueOf(10);
	//		System.out.println(str2.getClass().getName());
	//
	//		String str3 = String.valueOf(false);
	//		System.out.println(str3.getClass().getName());
	//
	//		System.out.println();
	//		// Convert String to primitive - parseXXX()
	//		String str4 = "10";
	//		int x2 = 100;
	//		System.out.println(str4.getClass().getName());// String
	//		System.out.println(str4+x2);//10100
	//
	//		int x1= Integer.parseInt(str4);
	//		System.out.println(x1); // 10
	//
	//		System.out.println(x1+x2);//110
	//
	//
	//	}
	//
	//}


	//Notes

	/*
	 * Wrapper Classes
	 *  To convert primitive data types(byte, short, int, long, float, double, boolean, char) to object type
	 *  
	 *  Collections/Cloning/Serialization
	 *  
	 *  pkg - java.lang
	 *  
	 *  Wrapper classes
	 *  Byte
	 *  Short
	 *  Integer
	 *  Long
	 *  Float
	 *  Double
	 *  Char
	 *  Boolean
	 * 
	 * - Convert primitive to Object
	 *   1. Constructors
	 *   2. valueOf() - method
	 *   3. Autoboxing
	 *   
	 * - Convert Object to primitive
	 *   xxxValue() - xxx - premitive data type
	 *   AutoUnboxing
	 * 
	 * - Wrapper Object to String Object
	 *   toString()
	 *   
	 * - Convert String to primitive
	 *   parseXXX()
	 *   
	 * - Convert primitive to String 
	 *    valueOf()
	 */


	//ReGex 

	public static void main(String[] args) {

		// Option 1: compile() & matcher()
		Pattern pattern = Pattern.compile(".[a-z]"); // pattern
		Matcher matcher = pattern.matcher("as"); // string
		System.out.println(matcher.matches());// true

		// Option 2: Pattern.matches()
		System.out.println(Pattern.matches(".a", "as")); //false
		System.out.println(Pattern.matches(".a", "%a"));// true
		System.out.println(Pattern.matches(".a", "as"));
		System.out.println();
		String contactNo = "1888 634 1407 (Toll Free)";
		System.out.println(Pattern.matches("\\d{4}\\s\\d{3}\\s\\d{4}\\s.*", contactNo));
		System.out.println();

		Pattern pattern1 = Pattern.compile("(\\d{4})\\s(\\d{3})\\s(\\d{4})\\s.*"); // pattern
		Matcher matcher1 = pattern1.matcher(contactNo); // string
		System.out.println(matcher1.matches()); // true

		System.out.println(matcher1.group()); // 1888 634 1407 (Toll Free)
		System.out.println(matcher1.group(1));//1888
		System.out.println(matcher1.group(2));//634
		System.out.println(matcher1.group(3));// 1407

	}
	
}





	//Notes	
	/*
	 * + 91 124 2641407 (International call rates applicable)
	 * 011 24667473 (Monday to Friday ,0930 hrs - 1730 hrs IST)
	 * flyingreturn.base@airindia.in
	 * golden.edge@airindia.in
	 * mr.
	 * mrs.
	 * 0124-2641407 
	 * contactus@airindia.in
	 * 613 701 98270 (Toll Number) #
	 */

	/*
	 * 
	 * Quantifiers
	 * '?' - 0-1 occurance of pattern 
	 * '+' - 1 or more 
	 * '*' - 0 or more
	 * '{10}' - number of times to occur
	 * '{5, 10}' - min 5 & upto 10
	 * '{5, }' - min 5 & max can be any time
	 * 
	 * Metacharecters
	 * \d - represents single digit
	 * \D - represents single non-digit
	 * \s - represents space
	 * \S - represents non space char
	 * \w - matches word chars [a-zA-Z_$]
	 * \W - matches other than word chars
	 *  . - single character
	 *  
	 *  String str = "Hello12";
	 *  \w\w\w\w\w\d\d
	 *  \w{5}\d{2}
	 *  
	 *  [a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][0-9][0-9]
	 *  [a-zA-Z]{5}[0-9]{2,5}
	 *  
	 *  String contactNo = "091 044 34563456" 
	 *  \d\d\d\s\d\d\d\s\d\d\d\d\d\d\d\d
	 *  \d{1, 3}\s\d{3, 5}\s\d{8,10}
	 *  
	 *  [0-9]{3}\s[0-9]{3}\s[0-9]{8, 10}
	 *  
	 *  
	 *  1.1.1.1
	 *  10.12.13.14
	 *  192.168.23.134
	 *  
	 *  1a1.1.1
	 *  1$1.1.1
	 *  
	 *  0-255
	 *  
	 *  0.0.0.0
	 *  255.255.255.255
	 *  [0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}
	 *  \d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}
	 *  \d{1,3}\.{3}\d{1,3}
	 *  
	 *  
	 *  
	 */








