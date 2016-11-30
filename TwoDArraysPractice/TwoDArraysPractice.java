/**
 * Felicia Ho
 * 11/29/16
 * Two dimensional arrays practice problems
 * Formatting a grid 
 */
 
 public class TwoDArraysPractice
 {
 	
 	/**
 	 * Main method that takes in command line argument
 	 * Calling the printArray to print the array made in create2D
 	 * @param args command line argument
 	 */
 	public static void main(String[] args)
 	{
 		/*
 		int[][] arr = new int[3][4]; 
 		printArray(arr);
 		
 		String[][] arr1 = new String[3][3];
 		printArray(arr1);*/
 		
 		printArray(create2D(4, 4));
 	}
 	
 	/**
 	 * 1 and 2. Please write a method that returns a 2D array initialized as follows:
 	 * 1 2 3 4 
       5 6 7 8 
       9 10 11 12 
       13 14 15 16 
     * And modify it so that the grid dimensions are put in as a parameter for rows and columns
 	 * Algorithm: First, initialize an int array to hold the amount of rows and columns necessary
 	 * Taking in the rows and the columns inputted 
 	 * Use a counter and increment each time through each box/each item
 	 * Using nested for loops to go through the array and set each to count
 	 * @param rows the number of rows (dimension n)
 	 * @param cols the number of cols wanted (dimension n)
 	 * @return the initialized array with all the numbers in it
 	 */
 	public static int[][] create2D(int rows, int cols)
 	{

 		int[][] arr = new int[rows][cols]; //initialize new array with the dimensions indicated
 		
 		int count = 1; //starting count at 1 
 		for(int row = 0; row < rows; row++) //goes through all the rows (the length of the array)
 		{
 			for(int col = 0; col < cols; col++) //goes through all the columns (the length of one
 			//item of the array)
 			{
 				arr[row][col] = count; //sets that item to count
 				count++; //incrementing count
 			}
 		}
 		
 		return arr; //returning the modified array
 
 	}

 	/** 
 	 * Print the array in a nice format (Overloaded method - see printArray(String[][]a method)
 	 --------------------
 	 | 1 | 2  | 3  | 4  |
 	 --------------------
 	 | 5 | 6  | 7  | 8  |
 	 --------------------
 	 | 9 | 10 | 11 | 12 |
 	 --------------------
 	 * Algorithm: 
 	 * Go through each item in the 2-D list by first going through the length of the array
 	 * So this length = number of rows total
 	 * Each length of each row is the number of columns
 	 * Access these by doing double brackets and print them. 
 	 * In order to make it "nicer," add a dashed line between each set
 	 * Each "item"/"box" in the total array is about 5 dashes, multiply this by the total
 	 * number of columns you have to get a neat set of dashes to separate rows.
 	 * Next, have bars to separate individual items within the array itself. 
 	 * If it is only a single digit number, than add extra spaces. If its not, then don't add
 	 * any extra spaces. - Helps to center everything.
 	 * @param a the array to print
 	 */
 	public static void printArray(int[][] a)
 	{
 		for(int row = 0; row < a.length; row++) //go through the rows of the array
 		{
 			printDashes(a[row].length); //-------------------- print dashes with helper function
 			System.out.print("|"); //print first grid separation
 			
 			for(int col = 0; col < a[row].length; col++) //go through the columns of the array
 			{
 				if (a[row][col] < 10) //extra space for single digit numbers
 				{
 					System.out.print(" " + a[row][col] + "  |"); //go through each item of the array and print
 				} 
 				else 
 				{ 
 					System.out.print(" " + a[row][col] + " |");
 				}
 			}
 			System.out.println();
 		}
 		printDashes(a[0].length); //prints final row of dashes
 		
 	}
 	
 	/** 
 	 * Helper function for printing the array nicely
 	 * Prints the dashes necessary
 	 * Number of dashes is set to 5 for each item 
 	 * as an equation - to adjust to uneven amounts of columns - therefore make a helper function.
 	 * @param n the number of times the dashes should be printed (# of columns)
 	 */
 	public static void printDashes(int n)
 	{
 		for (int dash = 0; dash < n; dash++)
 		{
 			System.out.print("-----");
 		}
 		System.out.println("");
 	}
 	
 	/**
 	 * Printing the arrays of strings (CLASS NOTES)
 	 * Overloaded method with the other printArray above that is used for int[][]
 	 * Overloaded = same name of the method, but different signatures (different inputs)
 	 * so it can still compile and run correctly. 
 	 * Algorithm: Go through each item in the 2-D list by first going through the length of the array
 	 * So this length = number of rows total
 	 * Each length of each row is the number of columns
 	 * Access these by doing double brackets and print them. 
 	 * @param a string array
 	 */
 	public static void printArray(String[][] a)
 	{
 		for(int row = 0; row < a.length; row++) //go through the length of the array = rows
 		{
 			for(int col = 0; col < a[row].length; col++) //go through the number of arrays
 			//in each first "row" of arrays 
 			{
 				System.out.print(a[row][col] + " "); //print each item
 			}
 			System.out.println();
 		}
 		
 	}
 
 }