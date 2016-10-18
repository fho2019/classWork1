/** 
 * @author Felicia Ho
 * @version 1.0
 * Recursive Exercises Classwork
 */
 
 public class RecursiveExercises
 {
 	
 	public static void main(String args[])
 	{
 		
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); //hasDigit
 		System.out.println(hasDigit("0d"));
		System.out.println(hasDigit("bc33"));
		System.out.println(hasDigit("ddeebcd"));
		System.out.println(hasDigit(""));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); //iterative w/charAt
		System.out.println(isPalindromeIC("abcba"));
 		System.out.println(isPalindromeIC("eat"));
 		System.out.println(isPalindromeRC("a"));
 		System.out.println(isPalindromeRW(""));
 		System.out.println(isPalindromeRW("abccba"));
 		
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); //recursive w/charAt
 		System.out.println(isPalindromeRC("abcba"));
 		System.out.println(isPalindromeRC("eat"));
 		System.out.println(isPalindromeRC("a"));
 		System.out.println(isPalindromeRW(""));
 		System.out.println(isPalindromeRW("abccba"));
 		
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); //iterative w/out charAt
 		System.out.println(isPalindromeIW("abcba"));
 		System.out.println(isPalindromeIW("eat"));
 		System.out.println(isPalindromeIW("a"));
 		System.out.println(isPalindromeRW(""));
 		System.out.println(isPalindromeRW("abccba"));
 		
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); //recursive w/out charAt
 		System.out.println(isPalindromeRW("abcba"));
 		System.out.println(isPalindromeRW("eat"));
 		System.out.println(isPalindromeRW("a"));
 		System.out.println(isPalindromeRW(""));
 		System.out.println(isPalindromeRW("abccba"));
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
			int c = (int) s.charAt(count);
			
			if ((c >= 48) && (c <= 57))
			{
				return true;
		
			}
		}
		return false;

	}
	
	/** 
	 * This method takes in a String and returns true if the given String is a palindrome.
	 * @param s the String to check whether it is a palindrome
	 * @return boolean true if palindrome, false otherwise
	 * iteratively with charAt using a while loop to check first/last indices
	 */
	
	public static boolean isPalindromeIC(String s)
	{
		int index0 = 0;
		int index1 = s.length()-1;
		
		while (index0 < index1)
		{
			if((s.charAt(index0)) != (s.charAt(index1)))
				return false;
			index0 += 1;
			index1 -= 1;
		}
		return true;
	}
	
 	/** 
	 * This method takes in a String and returns true if the given String is a palindrome.
	 * @param s the String to check whether it is a palindrome
	 * @return boolean true if palindrome, false otherwise
	 * recursively with charAt using substrings to "cut" the string and compare the indices
	 */
 	public static boolean isPalindromeRC(String s)
 	{
 		if ((s.length() == 0) || s.length() == 1) //base condition
 		{
 			return true;
 		}
 		else if (s.charAt(0) == s.charAt(s.length()-1))
 		{
 			return isPalindromeRC(s.substring(1, s.length()-1));
 		}	
 		return false;
 	}
 	
 	/** 
	 * This method takes in a String and returns true if the given String is a palindrome.
	 * @param s the String to check whether it is a palindrome
	 * @return boolean true if palindrome, false otherwise
	 * iteratively without charAt using indices and substrings to "cut" the string 
	 * character by character (first/last) and compare
	 */
 	public static boolean isPalindromeIW(String s)
 	{
 		int index0 = 0;
 		int index1 = s.length()-1;
 		
 		while(index0 < index1)
 		{
 			if (!(s.substring(index0, index0+1).equals(s.substring(index1, index1+1))))
			{
 				return false;
 			}
 			index0 += 1;
 			index1 -= 1;
 		}
 		return true;
 	}
 	
 	/** 
	 * This method takes in a String and returns true if the given String is a palindrome.
	 * @param s the String to check whether it is a palindrome
	 * @return boolean true if palindrome, false otherwise
	 * recursively without charAt using substrings to "cut" the string and compare indices
	 * character by character (first/last)
	 */
 	public static boolean isPalindromeRW(String s)
 	{
 		if ((s.length() == 0) || (s.length() == 1)) //base condition
 			return true;
 			
 		else if ((s.substring(0,1).equals(s.substring(s.length()-1, s.length()))))
 			return isPalindromeRW(s.substring(1, s.length()-1));
 			
 		return false;
 	}
 
 }
 