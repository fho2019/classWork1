/** Monty Hall
 * 1 out of 3 doors has a car
 * User tries to win the car by first picking a door
 * Then computer reveals one of the other two doors as a goat
 * User must choose to switch or stay 
 * @author Felicia Ho
 * @version 1.0 
 */
 import java.util.Scanner;
 public class MontyHall
 {
   /**
    * Java interpreter calls this main method
    * @param args This is the command line argument
    */
  	public static void main(String[] args)
  	{
  		//welcome message
  		welcome();
  		
  		//game call
  		game();
  
  	}
   /**
    * Welcome message to the user
    */
  	public static void welcome()
  	{
  	
  		System.out.println("\nWelcome to the Monty Hall Game.");
  		System.out.println("I will show you three doors. In one of them there is a car.");
  		System.out.println("Please pick a door number first. ");
  		System.out.print("You will have a chance to switch ");
  		System.out.println("after a door has been revealed. Answer with a yes or a no. \n");
  	
  	}
   
   /**
    * Computer runs the game by asking the user to pick a door, then revealing the door by calling
    * another method, then asking if the user would like to switch doors, and checking if the user's choice wins or not
    * effectively does not put everything in the game method - abstracts it into other methods 
    */
  	public static void game()
  	{
  		Scanner keyboard = new Scanner(System.in);
  		int car = (int) (Math.random()*3 + 1);
  		
  		System.out.print("Please pick a door (1, 2, or 3). ");
  		int userChoice = keyboard.nextInt();
  		// get rid of the new line from the buffer
  		keyboard.nextLine();
  		
  		// testing
  		// System.out.println("You chose door #: " + userChoice);
  		
  		int reveal = doorToReveal1(car, userChoice);
  		// int reveal = doorToReveal(car, userChoice);
  		System.out.println("Opened door #: " + reveal);
  		System.out.println("It has a goat in it.");
  		
  		// ask the user if they want to switch
  		System.out.print("Would you like to switch doors? ");
  		String answer = keyboard.nextLine();
  		
  		// testing
  		// System.out.println("The user wants to " + answer);
  		
  		if (answer.equals("yes"))
  		{
  			userChoice = doorToReveal1(userChoice, reveal);
  		}
  		
  		if (car == userChoice)
  			System.out.println("You got the car!");
  		else 
  		{
  			System.out.println("Sorry! You lose!!!");
  			System.out.println("The car is behind door # " + car);
  		}
  	
  	}
  	
  	/**
  	* Returned the door to reveal to the user
  	* Goes through the doors (1 - 3) and checks whether or not the door has already been 
  	* Chosen or already has a car in it - reveal the door that has not been chosen and not have car
  	* @param c Car door number
  	* @param u User choice of door number
  	* @return int door number to reveal to user
  	*/
  	public static int doorToReveal(int c, int u)
  	{
  		for (int doorReveal = 1; doorReveal < 4; doorReveal++)
  		{
  			if ((doorReveal != c) && (doorReveal != u))
  				return doorReveal;
  
  		}
  		return -1; // compiler must have this last condition to make sure (if, while, for)
  	}
  	
  	/**
  	* Returned the door to reveal to the user
  	* Choose a random number from 1 to 3  
  	* If the chosen one is equal to the door revealed as a car or revealed to the user,
  	* Keep on generating new random numbers until it is not equal to car/user - reveal this door
  	* @param c Car door number
  	* @param u User choice of door number
  	* @return int door number to reveal to user
  	*/
  	public static int doorToReveal1(int c, int u)
  	{
  		int r = (int) (Math.random() * 3 + 1); //generate random number
  		while (r == c || r == u)
  		{
  			r = (int) (Math.random() * 3 + 1); //generate random number
  		
  		}
  		return r;
  	}
  	
  	
 }
 
  
  
  
  