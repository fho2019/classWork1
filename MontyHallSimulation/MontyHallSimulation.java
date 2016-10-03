/** 
  * Simulates the MontyHall game in which user has to try and win the car out of three doors 
  * Usually, it is always better to switch, and this program simulates the likelihood of winning with switching
  * versus winning with staying
  * @author Felicia Ho
  * @version 1.0
  */


public class MontyHallSimulation
{

	/**
	* This method simulates a Monty Hall game and returns
	* 1 if switch win and returns 0 otherwise
	* Computer chooses a random car from doors 1 -3 
	* Randomly choose a guess from 1-3 for the user
	* Computer always chooses to switch
	* Start checking if the "user"'s guess is the same as the car - if it is, then the computer
	* which will always choose to switch - will lose
	* Otherwise, the computer will always win
	* @return int return 1 if switch win, 0 otherwise
	*/
	public static int game()
	{
		
		int car = (int) (Math.random() * 3 + 1);
		int guess = (int) (Math.random() * 3 + 1);
		
		if (guess == car)
			return 0; //lose
		else
			return 1; //win
	
	}
	
	/**
	  * This method takes in a double and truncates it to 2 decimal places
	  * @param d the double input to be truncated 
	  * @return double formatted to 2 decimal places
	  */
	public static double format(double d)
	{
		int temp = (int) (d * 100);
		return temp/100.0;
	
	}
	/**
	  * Java interpreter calling this main method
	  * Gets input from the user through the command line about how many times to run the simulation
	  * Runs through for loop of simulation
	  * Lays out the percentages of win/lose when switching
	  * @param args this is a command line argument, input the number of simulations
	  */ 
	public static void main (String[] args)
	{
		// Getting input from the user through the java interpreter in command line 
		String input = args[0];
		int numSim = Integer.parseInt(input);
		System.out.println("Ran " + numSim + " times of the Monty Hall game:");
		
		float switchWin = 0;
		
		for(int i = 0; i < numSim; i++)
			switchWin += game(); // use game() as int to keep track of the switchWin numbers
		
		double percentSwitchWin = format ( (double) switchWin/numSim * 100); //finds the percentages to a hundredth
		double percentStayWin = format (100-percentSwitchWin);
		System.out.println("% switch_win: " + percentSwitchWin);
		System.out.println("% stay_win: " + percentStayWin);
		


	}
}