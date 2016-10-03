/**
 * This is a program about loops (for loops)
 * @author Felicia Ho
 * @version 1.0
 */
 
 public class ForLoop
 {

	/**
	  * This is the main method 
	  * @param args This is a command line argument
	  */
	  public static void main(String[] args)
	  {
		// call to whileLoop
		whileLoop();
		
		System.out.println("--------------------");
		
		// call to forLoop
		forLoop();
		
		System.out.println("--------------------");
		nestedWhileLoop(4);
		
		System.out.println("--------------------");
		nestedForLoop(4);
		
		System.out.println("--------------------");
		downStaircaseStars(4);
	
		System.out.println("--------------------");
		upStaircaseStars(4);
		
		}
	
	/**
	 * While loop method counting from 1 - 10 
	 */
	 public static void whileLoop()
	 {
		int count = 1;
		while (count <= 10)
		{
			System.out.println(count);
			count++; // count += 1
		}
	  }
	
	/**
	 * Using a for loop to count from 1-10
	 */
	 public static void forLoop()
	 {
		// int i;
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i);
	
		}
	}
	 
	/** 
	 * Using nested while loops to make an n by n array of stars
	 * @param n Number rows by Number stars (rows by stars array) passed in from main
	 */
	 public static void nestedWhileLoop(int n)
	 {
		int rows = 0;
		while (rows < n)
		{
			int columns = 0;
			while (columns < n)
			{
				System.out.print("*");
				columns++;
			
			}
			System.out.println("");
			rows++;
		 }
	 }
	 
	 /**  
	  * Using nested for loops to make a n by n array of stars
	  * @param n Number rows by Number stars (rows by stars array) passed in from main
	  */
	  public static void nestedForLoop(int n)
	  {
		for (int row = 0; row < n; row++)	
		{
			for (int column = 0; column < n; column++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	  }
	
	/**
	 * Prints the following pattern by using nested for loops in making rows and columns 
	 * column continues to print stars until its sum with row is equal to n, moves onto next line
	 *  ****
     *  ***
     *  **
     *  *
	 * @param n Number of rows to print
	 */
	public static void downStaircaseStars(int n)
	{
		for (int row = 0; row < n; row++)
		{
			for (int col = 0; col + row < n; col++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	/**
	 * Prints the following pattern by using nested for loops in making rows and columns
	 * column continues to print stars until it equals row (according to a grid), moves onto next line
	 *  *
     *  **
     *  ***
     *  ****
	 * @param n Number of rows to print
	 */
	public static void upStaircaseStars(int n)
	{
		for (int row = 0; row < n; row++)
		{
			for (int col = 0; col <= row; col++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	
	
	}
	
}
 
