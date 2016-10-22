/**
 * Recursive method practice
 * @author Felicia Ho
 * @version 1.0
 */
 
 public class RecursionIntegers
 {
 	/**
 	 * This is a main method calling printNum 
 	 * @param args This is a command line argument
 	 */
 	public static void main (String[] args)
 	{
 		//call to printNum method with a primitive int
 		printNum(10);
 	
 	}
 	/**
 	 * This method prints the integers from 0 to n both inclusive, on separate lines
 	 * using recursion 
     * Algorithm: base condition is at n = 0
     * Changing the n (decrementing by 1 each time) and calling the function/itself with decremented n
     * it will print the 0 first, and then going back up the recursion stack, n will no longer be
     * 0, and it will go to after "printNum(n-1)" because the previous are already executed
     * -> printing n itself
     * In the end, after all the recursion and going back to previous numbers, it will print
     * ascending 0 - n
     * @param n the largest integer printed on the screen
     */ 
 	public static void printNum(int n)
 	{
 		if (n > 0)
 		{
 			printNum(n-1);
 		}
 		System.out.println(n);
 	
 	}
 
 
 }