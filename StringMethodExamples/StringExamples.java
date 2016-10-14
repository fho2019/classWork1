public class StringExamples
{
	
	public static void main(String[] args)
	{
		//how to get char of ASCII value
		int i = 65; 
		char c = (char) i;
		System.out.println(c);
		
		//how to get ASCII value of a char
		char d = 'e';
		int j = (int) d;
		System.out.println(j);
		
		String s = "abc";
		String s1 = new String("abcd");
		String s2 = new String("abc");
		String s3 = new String("abe");
		
		System.out.println("*********************************");
		
		System.out.println(s.compareTo(s1)); //-1 (s1 has an extra character)
		System.out.println(s1.compareTo(s)); //1 (s1 has an extra character)
		System.out.println(s.compareTo(s2)); //the same 0
		System.out.println(s.compareTo(s3)); //-2 (ascii difference)
		
		System.out.println("*********************************");
		
		System.out.println(s3.compareTo(s)); //2 (ascii difference)
		System.out.println(s1.compareTo(s2)); //1 (s1 is longer than s2)
		System.out.println(s2.compareTo(s2)); //0 the same
		System.out.println(s2.compareTo(s3)); //-2 (ascii difference)
		
		System.out.println("*********************************");
		System.out.println(s1.indexOf(s)); //where the first occurence of s is 
		
		System.out.println("*********************************");
		System.out.println(s1.charAt(1));
		System.out.println((int) s1.charAt(1)); //ASCII value
		
		System.out.println(hasDigit("0d"));
		System.out.println(hasDigit("bc33"));
		System.out.println(hasDigit("ddeebcd"));
		
	}
	/**
	 * This method takes in a string and returns true if the given string has a digit
	 * and returns false otherwise
	 * @param s The given string to check whether it has a digit
	 * @return boolean true if it has a digit, false otherwise
	 * Typecast into ASCII and check the ASCII range (48 to 57)
	 */
	public static boolean hasDigit(String s)
	{
		for (int count = 0; count < s.length(); count++)
		{
			if (((int)s.charAt(count) >= 48) && ((int)s.charAt(count) <= 57))
			{
				return true;
		
			}
		}
		return false;

	
	}

}