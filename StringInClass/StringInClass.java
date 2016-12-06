/**
 * String Method Exercises in Class
 * @author Felicia Ho
 * @version 1.0
 *
 */ 


public class StringInClass
{
	/**
	 * This is a main method calling methods below 
	 * @param args This is a command line argument
 	 */
	 
	public static void main (String[] args)
	{
		System.out.println("*************************************************");
		//Calls to the findString method
		System.out.println(findString("abcd", "ab", 1));
		System.out.println(findString("abcdabc", "abc", 2));
		System.out.println(findString("abcdef", "cde", 0));
		
		System.out.println("*************************************************");
		//Calls to the countString method
		System.out.println(countStrings("abcdef", "cde"));
		System.out.println(countStrings("abcdecdef", "cde"));
		System.out.println(countStrings("cdedecdef", "cde"));
		System.out.println(countStrings("afd", "cde"));
		System.out.println(countStrings("ab", "")); 
		System.out.println(countStrings("abababab", "abab"));
		System.out.println(countStrings("", "ab"));
		System.out.println(countStrings("", "")); 
		System.out.println(countStrings("abcf", "abc")); 
		
		System.out.println("*************************************************");
		//Calls to the convertItalics method
		System.out.println(convertItalics("This is _very_ good."));
		System.out.println(convertItalics("_This_ is _very_ _good_."));
		System.out.println(convertItalics("This is _very good."));
		System.out.println(convertItalics("This is __very good." ));
		System.out.println(convertItalics("I___am_arobot"));
	}
	
	/**
     * Finds the first instance of s in line,
     * starting at the position start
     * @param o the orignal string 
     * @param s the string to find 
     * @param start the position to start searching.
     * Guaranteed to be in the string line. (precondition)
     * @return the index of the first single instance of
     * s if the string is found OR -1 if it is not found.
     * New string is made starting from the indicated start position; check where the s is in that new string
     * If there is none, return -1
     * Otherwise, return the actual index of the s based on the original, whole string 
    */
	public static int findString (String o, String s, int start)
	{

		String checked = o.substring(start);
		int index = checked.indexOf(s);
		if (index == -1)
		{
			return index;
		}
		else
		{
			int index1 = index + (o.length()-checked.length()); //returns the actual index
			//which is just the partial string's index of s and how much the checked had cut off from original o
			return index1;
		}
	
	}
	
	 /**
 	  * Count the number of times instances of s appear in
      * the line.
 	  * @param o the original string
      * @param s the string to find.
      * @return the number of times the string appears in the line
      * Set up an initial count and goes through while loop checking if the s is in the o
      * If it is, the count is increased; otherwise, the while loop ends and the count is returned
      */
    public static int countStrings (String o, String s)
    { 
    	
    	int count = 0;
    	
    	boolean cont = true; //Decides whether the while loop should continue running or not
    	
    	if (s.length() == 0) //takes care of test case in which s is an empty string (therefore, there
    	//are no empty strings ina an o string
    	{
    		return count;
    	}
    	
    	while (cont && o.length() >= s.length()) //checks to make sure that o can still include s and 
    	//s is in o for sure
    	{
    		if (o.indexOf(s) != -1)
    		{	
    			count += 1;
    			o = o.substring(o.indexOf(s) + (s.length())); //set substring to the next section of the o string
    			
    		}
    		
    		else
    		{
    			cont = false; //only goes here if there is no s in o
    		}
    	
    	} 
    	
    	return count;

    }
    
    /**
     * Replace all instances of underscores in the line given by line with italics tags.
     * There must be an EVEN number of underscores in the line, and they will be replaced by
     * <I>, </I> alternating.
     * @param line a string with 0 or more underscores
     * @return the line that has underscores replaced with <I> </I> tags or
     * the original line if there are not an even number of underscores.
     * Check how many underscores there are in the given string
     * Odd number of underscores = return original 
     * Even = set up for loop going through each underscores
     * Set the italics to <I> first (for even underscores), then for odd, italics would be </I>
     * Return the substring afterwards, which will include the first section + italic/underscore change + remaining section of string
     */
    
    public static String convertItalics (String line)
    {

    	int count1 = countStrings (line, "_");
    	
    	
    	if (count1 % 2 == 1)
    	{
    		return line;
    	}
    	
    	else
    	{
    		int next = 0; 
    		String italics = "<I>";
    		
			for (int count = 0; count < count1; count++)
			{
				
				next = findString(line, "_", next); //finds where the first instance of the underscore is
				
				if (line.substring(next+1, next+2).equals("_"))
				{
					count += 1;
					next += 2;
				
				}
				
				else
				{
					if (count % 2 != 0)
					{
						italics = "</I>";
					
					}
				
					else
					{
						italics = "<I>";
					}
					line = line.substring(0, next) + italics + line.substring(next+1);
				}
				
				
				
			}
			return line;
		}
    }
    
    /* 
  Examples:
  line                             value returned by convertItalics
  
  "This is _very_ good."           "This is <I>very</I> good."
  "_This_ is _very_ _good_."       "<I>This</I> is <I>very</I> <I>good</I>."
  "This is _very good."            "This is _very good."
  "This is __very good."           "This is __very good."
     */
     
 
 	

}