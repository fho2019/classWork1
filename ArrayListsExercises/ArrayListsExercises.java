/**
 * Felicia Ho 
 * 12/08/16
 * Array List Exercises Classwork
 */
 
 import java.util.ArrayList; //must import the array list package
 
 public class ArrayListsExercises
 {
 	/** 
 	 * Main method calling the two methods as well as initiating the two ArrayLists
 	 * @param args command line argument String
 	 */
 	public static void main (String[] args)
 	{
 		ArrayList<Integer> a = new ArrayList<Integer>(); //initiating the ArrayList
 		/*
 		for (int x = 0; x < a.size(); x++)
 		{
 			a.add((int) Math.random() * 10 + 1);
 		}*/ //can use a for loop to put in random integers into the arrayList 
 		//to test the given test case, must use add method to attach to end of the list
 		a.add(2);
 		a.add(2);
 		a.add(0);
 		a.add(-2);
 		a.add(4);
 		a.add(2);
 		replaceInt(2, a); //calling replaceInt to remove the 2s in the arrayList
 		System.out.println(a); //print the array with the removed 2s
 		
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
 		
 		ArrayList<String> s = new ArrayList<String>(); //initiating the ArrayList
 		s.add("eye");
 		s.add("abc");
 		s.add("elephant"); //adding in for the test case given
 		replaceE(s); //calling replaceE to change the es to xs 
 		//no return because only modifying the arrayList
 		System.out.println(s); //print the array with the replaced es
 	
 	}
 	
 	/** 
 	 * Please write a method that takes in an integer and an ArrayList of Integer
 	 * as parameters and removes all occurrences of that int from the ArrayList.
 	 * Algorithm: Going through the ArrayList by using a for loop
 	 * Using the get method to get whatever is at that index in the ArrayList
 	 * Removing that index 
 	 * But since your removed it, the size will change, so to compromise, you must subtract 
 	 * one from the index as well.
 	 * ArrayList is modified.
 	 * @param a the ArrayListInteger that you will be removing terms from
 	 * @param i integer to look for and remove from the ArrayList
 	 */

 	public static void replaceInt(int i, ArrayList<Integer> a)
 	{
 		for (int x = 0; x < a.size(); x++) //goes through arrayList
 		{
 			if (a.get(x).equals(i)) //if what's at the index = the number, then remove that from
 			//the array list
 			{
 				a.remove(x);
 				x--; //size changes when you remove something 
 				//to compensate
 			}
 		}
 	}

 
 	/** 
 	 * Please write a method that takes in an ArrayList of Strings and replaces
 	 * all occurrences of the character 'e' with 'x' in the strings in the given arrayList
 	 * e.g. ["eye", "abc", "elephant"]
 	 * ["xyx", "abc", "xlxphant"]
 	 * Algorithm: Go through the ArrayList using a for loop 
 	 * Nested for loop goes through the indices, but the also goes through each word at each index
 	 * Have to create a new word each time and replace whatever was at the index originally
 	 * in that ArrayList to set to the new word
 	 * New word will be going through the loop and checking if the first letter is equal to 
 	 * e or not, and if so, then replace the e with an x
 	 * @param a the ArrayListInteger that you will be removing terms from
 	 */
 	 
 	 public static void replaceE(ArrayList<String> a)
 	 {
 	 	for (int x = 0; x < a.size(); x++) //for loop going through arrayList
 	 	{
 	 		String word = a.get(x); //creating a new word to replace the old word
 	 		for (int i = 0; i < word.length(); i++) //go through each word in the arrayList
 	 		{
 	 			if (word.substring(i, i+1).equals("e")) //if that first letter
 	 			//of the new word is "e" then want to concatenate/change to x
 	 			{
 	 				word = word.substring(0, i) + "x" + word.substring(i+1); 
 	 			
 	 			}
 	 		
 	 		}
 	 		a.set(x, word); //reset the word at that index to the new, changed word
 	 	
 	 	}
 	 }
 
 
 
 
 }