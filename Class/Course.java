import java.util.ArrayList; //import the array list package (must)

/**
* Felicia Ho, Christine Shao, Andrew Lee
* Course Program
* class that has "has a" relationship with Student class. 
*/

public class Course
{
	//class fields
	
	//non static class fields
	private ArrayList<Student> studList; //studList holds the list of students in that course (Object Student)
	private int courseNum; //courseNum holds the course's number
	private String courseName; //course's name
	
	//static
	private static int totalCourses; //applies to how many times the user created a course 
	//total number of courses ever created
	
	//constructors
	/**
	* Default constructor
	* Default constructors do not need any parameters. 
	* When this is called from the client/runner, will set 
	* class fields to its respective values
	* Set the list of students to null, courseNum to 0, courseName to empty string, 
	* increment the totalCourses number
	*/
	public Course()
	{
		studList = null;
		courseNum = 0;
		courseName = "";
		totalCourses++;
	}
	
	/**
	* Overloaded constructor
	* When this is called from the client/runner, the
	* class fields will get the value from its corresponding
	* formal parameter passed in from a call to construct the object
	* Also incrementing the total Courses because creating another course object
	* @param students the list of students for that class
	* @param classNum the course number
	* @param className the course name
	*/
	public Course(ArrayList<Student> students, int classNum, String className)
	{
		studList = students;
		courseNum = classNum;
		courseName = className;
		totalCourses++;
	}
	
	//accessors (non static because calling on the object (specific for each class object)
	
	/**
	* Allows client to access the class field studlist
	* but client cannot modify it without using the modifier method (corr.)
	* Returns the array list of students in a certain class 
	* @return list of students of course
	*/
	public ArrayList<Student> getStudList()
	{
		return studList;
	}
	
	/**
	* Allows client to access the class field courseNum
	* But client cannot modify it without using the modifier method (corr.)
	* Returns the course's number 
	* @return course number
	*/
	public int getCourseNum()
	{
		return courseNum;
	}
	
	/**
	* Allows client to access the class field courseName
	* but client cannot modify it without using the modifier method (corr.)
	* Returns the course name 
	* @return course name
	*/
	public String getCourseName()
	{
		return courseName;
	}
	
	/**
	* Allows client to access the class field totalCourses
	* but client cannot modify it without using the modifier method (corr.)
	* Returns the totalCourses (all courses made)
	* static fields must be referenced from a static method
	* @return totalCourses
	*/
	public static int getTotalCourses()
	{
		return totalCourses;
	}
	
	
	//modifiers (all non static because calling on specific object to change that object's class field)
	
	/**
	* Allows client to modify studList by adding a student to the class list (studList)
	* Student object itself includes subjects, numID and name
	* If the class already has that student, the same student will not be added (no repetition)
	* @param s the student to be added to the studList
	*/
	public void addToClassList(Student s)
	{
		boolean alreadyIn = false; //switch for if the student is already in the class or not
		for (int i = 0; i < studList.size(); i++)
		{
			if (studList.get(i).equals(s)) //calls the over rided equals method in the student class
			{	
				alreadyIn = true; //student already in class (don't need to add another)
			}
		}
		if (!(alreadyIn))
		{
			studList.add(s);
		}
	}
	
	/**
	* Allows client to modify studlist by removing a specified student  
	* from the class list of students 
	* @param s the removal of the student after searching through the class list
	*/
	public void removeFromClassList(Student s)
	{
		for (int i = 0; i < studList.size(); i++)
		{
			if (studList.get(i).equals(s)) //calls the over rided equals method in the student class
			{	
				studList.remove(i);
				i--; //decrement to account for any size loss and index out of range
			}
		}
	}

	//toString method (non static because calling on specific object to change that object's class field)
	/**
	* String representation of the object that is calling toString()
	* Will print out: the studlist = courseName (courseNum)
	* calls the printArray helper function to print the studList array list
	* @return the String to print out onto the screen
	*/
	public String toString()
	{
		printClassList();
		return " = " + courseName + " " + "(" + courseNum + ") ";
	}
	
	/**
	* private because just for the toString method and static because helper for the toString
	* Prints out the content in a ArrayList of type Student
	* in a readable format
	* @param students the list of students in a class
	*/
	private void printClassList()
	{
		for (int i = 0; i < studList.size(); i++)
		{
			System.out.print(studList.get(i).getName());
		}
	} 
	
	//other methods
	
	/**
	* static
	* Compares the size of two courses (ArrayList)
	* Returns the course that has the most students
	* However, if both courses have the same number 
	* of students, method returns null
	* @param a one course
	* @param b another course
	* @return the course with biggest class size (a) - if a's size is greater than b's size
	* @return null (if same)
	* @return the course with the biggest class size (b) - if b's size is greater than a's size
	*/
	public static Course compareClassSize(Course a, Course b)
	{
		if (a.studList.size() > b.studList.size())
		{
			return a;
		}
		else if (a.studList.size() == b.studList.size())
		{
			return null;
		}
		else
		{
			return b;
		}
	}

}