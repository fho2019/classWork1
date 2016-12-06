/**
 * Farmer's Game 
 * Goal of the game: bring all items to the other side of the bank without losing any item
 * Leaving the chicken and the wolf alone on one bank will result in the wolf eating the chicken
 * Leaving the chicken and the cabbage alone on one bank will result in the chicken eating the cabbage
 * Human must travel with every item in order to bring it across the river
 * @author: Felicia Ho
 * @version: 1.0
 * Algorithm: make w, c, s, h boolean variables (toggle between banks for false/true) 
 * continue until all of them are the same/on the same bank
 * keep on checking (human must be on the same side as w, c, or s) 
 */
  
  // import for user input
  import java.util.Scanner;
  
  public class FarmersGame
  {
  	//global scope
  	public static boolean cabb;
  	public static boolean sheep;
  	public static boolean wolf;
  	public static boolean human;
  	
  	/**
  	 * This is a main method calling welcome, displayGame, running a loop out of the game
  	 * Continues until user wins or user messes up
  	 * @param args This is a command line argument
  	 */
  	public static void main(String[] args)
  	{
  		welcome(); //call to welcome user
  		
  		Scanner kb = new Scanner(System.in);
  		
  		while (checkBanks() == 1) //continues while checkBanks says the game is NOT over and the user has NOT won 
  		{
  			displayGame(); //displays the status
  			System.out.print("What would you like to move then? "); //prompt user
  			String move = kb.nextLine().toLowerCase();
  			
  			//checks if the human is on the same side as the item
  			while (!(validMove(move))) 
  			{
  				move = kb.nextLine().toLowerCase();
  			}
  			System.out.println("********************************************************");
  			moveThings(move); //moves items
  			
  		}
  		displayGame();

  	}
  	
  	/**
  	 * Welcoming user to the farmer's game
  	 */
  	  public static void welcome()
  	  {
  		  System.out.println("Farmer's Game");
  		  System.out.println("The goal of the game is to move all of the items to the other side.");
  		  System.out.print("Warning: if you leave the wolf and the sheep on the same side, then the");
  		  System.out.println(" wolf will eat the sheep.\nThe sheep will eat the cabbage too if they are on the same side.");
  		  System.out.println("The human must move with every object, so it must be on the same bank.");
  		  System.out.println("Type in a lower case h for human, c for cabbage, w for wolf, and s for sheep.");
  		  System.out.println("********************************************************");
  	  }
  	
  	/**
  	 * Displaying the game each time after the user chooses to move something
  	 * Toggles between the bank0 and bank1 (bank0 false, bank1 true) 
  	 * String concatenation to the banks
  	 */
  	  public static void displayGame()
  	  {
  	  	  String bank0 = " ";
  	  	  String bank1 = " ";
  	  	  
  	  	  if (!cabb)
  	  	  {
  	  	  	bank0 += "   C    ";
  	  	  }
  	  	  else
  	  	  {
  	  	  	bank1 += "   C    ";
  	  	  }
  	  	  if (!sheep)
  	  	  {
  	  	  	bank0 += "   S    ";
  	  	  }
  	  	  else
  	  	  {
  	  	  	bank1 += "   S    ";
  	  	  }
  	  	  if (!wolf)
  	  	  {
  	  	  	bank0 += "   W    ";
  	  	  }
  	  	  else
  	  	  {
  	  	  	bank1 += "   W    ";
  	  	  }
  	  	  if (!human)
  	  	  {
  	  	  	bank0 += "   H    ";
  	  	  }
  	  	  else
  	  	  {
  	  	  	bank1 += "   H    ";
  	  	  }
  	  	  
  	  	  System.out.println(bank0);
  	  	  System.out.println("--------------------------------------\n");
  	  	  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
  	  	  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
  	  	  System.out.println("--------------------------------------");
  	  	  System.out.println(bank1);
  	  }
  	
  	/**
  	 * Error checking method to make sure that the item must travel with a human
  	 * @param move String that holds user's guess/choice
  	 * @return whether the next move is valid
  	 */
  	public static boolean validMove(String move)
  	{
  		//checks if the human is on the same side as the item, prompts uers
  		if ( (move.equals("c") && (human != cabb)) ||
  			(move.equals("w") && (human != wolf)) ||
  			(move.equals("s") && (human != sheep)) ) 
  		{
  			System.out.println("Sorry, but you must have the human moving the item.");
  			System.out.print("Please repick an item that is on the same side as the human. ");
  			return false; //not on the same side
  			
  		}
  		return true; //on the same side
  	
  	}
  
  	
  	/**
  	 * Moves the objects from one bank to the other based on the user's choice
  	 * Toggles the cabb/human/wolf/sheep between true and false to flip between the banks
  	 * The banks have no specific assigned value of true/false then
  	 * @param userChoice what the user picks to move
  	 */
  	 public static void moveThings(String userChoice)
  	 {
  	 	if (userChoice.equals("c"))
  	 	{
  	 		cabb = !cabb; 
  	 		human = !human;
  	 	}
  	 	else if (userChoice.equals("w"))
  	 	{
  	 		wolf = !wolf;
  	 		human = !human;
  	 	}
  	 	else if (userChoice.equals("s"))
  	 	{
  	 		sheep = !sheep;
  	 		human = !human;
  	 	}
  	 	else if (userChoice.equals("h"))
  	 	{
  	 		human = !human;
  	 	}
  	 
  	 }
  	 
  	/**
  	 * Checking the status of the game
  	 * if the cabbage/sheep or wolf/sheep are on the same side w/o the human: user loses
  	 * @return status of the game user loses (0) continues (1) wins (2)
  	 */
  	 public static int checkBanks()
  	 {
  	 	if ((cabb == sheep) && (sheep != human))
  	 	{
  	 		System.out.println("Uh oh. The sheep ate the cabbage! You lose!");
  	 		return 0; //user loses
  	 	}
  	 	else if ((wolf == sheep) && (wolf != human))
  	 	{
  	 		System.out.println("Uh oh. The wolf ate the sheep! You lose!");
  	 		return 0;
  	 	}
  	 	else if (wolf && cabb && human && sheep)
  	 	{
  	 		System.out.println("You win.");
  	 		return 2; //user wins
  	 	}
  	 	else
  	 	{
  	 		return 1; //user continues the game
  	 	}
  	 
  	 }
  }

