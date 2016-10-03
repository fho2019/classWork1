import java.util.Scanner;

/**
 * Chatbot program that prompts the user for inputs and has a conversation with the user.
 * Chatbot asks user for name, asks "how are you doing", age, height, favorite color, favorite food.
 * It uses the user's name several times to keep the conversation personal and friendly.
 * After running out of topics to go through, the chatbot will prompt user for topics and
 * Continues to prompt user until user says "bye" or "Bye" and the program ends.
 * @author Felicia Ho
 * @version 1.0 (09/15/16)
 */
 public class ChatBot
 {
  	/**
  	 * This is the main method that the java interpreter calls
  	 * @param args This is a command line argument
  	 */
  	 public static void main (String[] args)
  	 {
  		// create/construct a Scanner obj for user input
  		Scanner kb = new Scanner(System.in);
  		System.out.println("Hi there! Welcome to my chatbot! Ready to have a real conversation?");
  		
  		//greetings to user
  		System.out.print("What's your name? ");
  		String name = kb.nextLine();
  		System.out.print("Hi, " + name + "! How are you doing today? ");
  		String input = kb.nextLine();
  		System.out.println("Same here! I'm " + input + " too!");
  		
  		//if else statements with age
  		System.out.print("How old are you? ");
  		int age = kb.nextInt(); // have to make a new object as an integer because the nextInt() returns an int
  		if (age > 30)
  		{
  			System.out.println(name + ", you are a teensy bit old!");
  		}
  		else
  		{
  			System.out.println("Nice!");
  		}
  		
  		//height if else, else if statements
  		System.out.print("How tall are you? ");
  		double height = kb.nextDouble();
  		if (height > 6.0)
  		{
  			System.out.println(name + ", you are soooooo tall! xD");
  		}
  		else if (height > 5.0)
  		{
  			System.out.println(name + ", nice height! ~(^.^~)");
  		}
  		else
  		{
  			System.out.println(name + ", sorry you are kind of short! :p");
  		}
  		
  		// will get rid of the newLine char from the previous input
  		kb.nextLine();
  		System.out.print("What is your favorite color? ");
  		String color = kb.nextLine();
  		System.out.println("It's really cool that " + color + " is your favorite!");
  		System.out.println("I like all the colors!~");
  		
  		System.out.println("How about we talk about food instead? ");
  		System.out.print("What's your least favorite food? ");
  		String answer = kb.nextLine();
  		System.out.println("Hahaa..  Too bad that I love " + answer + ". :D");
  		
  		answer = "";
  		System.out.println("What do you want to talk about?");
  		
  		// DeMorgan's Law of Logic 
  		// Continues prompting user for topics until user quits by saying bye through while loop
  		while (!(answer.equals("bye")) && !(answer.equals("Bye")))
  		{
  			answer = kb.nextLine();
  			System.out.println("Ok, but I think that " + answer + " is a little too dry for me.");
  			System.out.println("What else do you want to talk about?");
  		}
  		
  		System.out.println("Fine then. Bye bye for now...");
  	}
  }
  
  
  	  
  	