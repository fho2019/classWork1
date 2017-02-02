import java.util.ArrayList; //import the array list package (must)

/**
 * Felicia Ho, Christine Shao, Andrew Lee
 * Student Class Program
 * Student that holds its schedule, ID and name 
 * Complete with accessors, modifiers, and another method that gives the student what class they 
 * have during a certain period
 */
public class Student
{
	//private fields
	private ArrayList<String> subjects; //list of subjects that the student is currently taking
	//(schedule)
	private int numID; //ID number that the student has
	private String name; //the student's name
	
	/** 
	 * constructor
	 * Student default constructor
	 * No schedule - set to null
	 * No numID - set to 0 automatically
	 * No name - set to empty string
	 */
	public Student()
	{
		subjects = null;
		numID = 0;
		name = "";
	}
	/**
	 * constructor
	 * Student constructor that constructs a student object 
	 * based on student's information including their schedule, ID Number and name
	 * @param topics the list of topics that the student is taking
	 * @param ID student's ID
	 * @param name student's name 
	 */
	
	public Student(ArrayList<String> topics, int ID, String name)
	{	
		subjects = topics;
		numID = ID;
		this.name = name;
	}
	
	/**
	 * accessor
	 * getSubj method that accesses the subject list of the Student object
	 * @return student schedule
	 */
	public ArrayList<String> getSubj()
	{
		return subjects;
	}
	
	/**
	 * accessor
	 * getID method that accesses the ID number of the Student object
	 * @return ID number of the student
	 */
	public int getID()
	{
		return numID;
	}
	
	/**
	 * accessor
	 * getName method that accesses the student's name
	 * @return the student's name 
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * modifier
	 * changeTopics method that changes the student's schedule completely (all periods) 
	 * @param topics the new schedule list that the student wants to change their whole entire current
	 * schedule to
	 */
	public void changeTopics(ArrayList<String> topics)
	{
		subjects = topics;
	}
	
	/**
	 * modifier
	 * setClass method that changes the class that the student is taking during a certain period
	 * @param course the new course that the student wants to take
	 * @param period the period that the student wants to switch out an old course with a new one in
	 */
	public void setClass(String course, int period)
	{
		subjects.set(period-1, course);
	}
	
	/**
	 * modifier
	 * changeName method that changes the student's name 
	 * @param n that the student wants to change their current name to
	 */
	public void changeName(String n)
	{
		name = n;
	}

	/**
	 * toString method
	 * print the student's schedule as an array
	 * print the student's ID number and name 
	 * @return the student's ID number and student's name
	 */
	public String toString()
	{	
		printSubj();
		return "= " + numID + " " +  name;
	}
	
	/**
	 * printArray method that the toString method can call to print out the schedule
	 * using for loop, print out each element of the topics array list 
	 * @param topics the student's schedule
	 */
	private void printSubj()
	{
		for (int i = 0; i < subjects.size(); i++)
		{
			System.out.print(subjects.get(i) + " ");
		}
	}

	/**
	 * Non static because calling on own object
	 * Have to override the equals method that Object originally had
	 * Instead, the students are only equal when they have the same ID Number
	 * Calling this function in the course class when comparing students 
	 * @param s2 the student that we will be comparing to (whether equal or not)
	 * @return whether or not the students are equal
	 */
	public boolean equals(Student s2)
	{
		if (this.numID == s2.numID)
		{
			return true;
		}
		return false;
	}
	
	/**
	 * getClass method that gives the student the class in a certain period that they will input
	 * If the student is asking what class he has during a certain period
	 * @param period the period the student is asking about
	 * @return the class that the student has during that period 
	 */
	public String getClass(int period)
	{
		return subjects.get(period-1);
	}
	
}