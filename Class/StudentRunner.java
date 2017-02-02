import java.util.ArrayList; //import the array list class 

/**
 * Felicia Ho, Christine Shao, Andrew Lee
 * Student Runner Program
 * Creates students and classes 
 */
public class StudentRunner
{
	/**
	 * Main method to run the program
	 * @param args the command line argument
	 */
	public static void main(String[] args)
	{
		//student1's schedule 
		ArrayList<String> s1Schedule = new ArrayList<String>();
		s1Schedule.add("AP US History");
		s1Schedule.add("Ethical Dilemma");
		s1Schedule.add("Honors Physics");
		
		//student2's schedule
		ArrayList<String> s2Schedule = new ArrayList<String>();
		s2Schedule.add("AP US History");
		s2Schedule.add("Magical Realism");
		s2Schedule.add("AP Chem");
		
		//student3's schedule
		ArrayList<String> s3Schedule = new ArrayList<String>();
		s3Schedule.add("AP US History");
		s3Schedule.add("Magical Realism");
		s3Schedule.add("AP Chem");
		
		//student4's schedule
		ArrayList<String> s4Schedule = new ArrayList<String>();
		s4Schedule.add("AP US History");
		s4Schedule.add("Magical Realism");
		s4Schedule.add("AP Chem");
		
		//student5's schedule
		ArrayList<String> s5Schedule = new ArrayList<String>();
		s5Schedule.add("AP US History");
		s5Schedule.add("Magical Realism");
		s5Schedule.add("Physics");
		
		//creating all the student objects with a schedule each and a ID number each with a 
		//student name each
		Student s1 = new Student(s1Schedule, 100, "Andrew ");
		Student s2 = new Student(s2Schedule, 101, "Felicia ");
		Student s3 = new Student(s3Schedule, 102, "Christine ");
		Student s4 = new Student(s4Schedule, 103, "Luke ");
		Student s5 = new Student(s5Schedule, 104, "Darlene ");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("All Students: (schedule list, id number, name)");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		//creates a new class [array list of students that have that class] (like History)
		//adds all the students that have that class
		ArrayList<Student> courseHistory = new ArrayList<Student>();
		courseHistory.add(s1);
		courseHistory.add(s2);
		courseHistory.add(s3);
		courseHistory.add(s4);
		courseHistory.add(s5);
		
		//creates a new class [array list of students that have that class] (like English)
		//adds all the students that have that class
		ArrayList<Student> courseEnglish = new ArrayList<Student>();
		courseEnglish.add(s2);
		courseEnglish.add(s3);
		courseEnglish.add(s4);
		courseEnglish.add(s5);
		
		//creates a new class [array list of students that have that class] (like Science)
		//adds all the students that have that class
		ArrayList<Student> courseScience = new ArrayList<Student>();
		courseScience.add(s2);
		courseScience.add(s3);
		courseScience.add(s4);
		
		//creates three courses with the names and the different class lists of students in that class
		//with the class number each
		Course c1 = new Course(courseHistory, 7785, "AP US History");
		Course c2 = new Course(courseEnglish, 7786, "Magical Realism");
		Course c3 = new Course(courseScience, 7787, "AP Chem");
		
		//use toString and print out each class with the people in the class = 
		//course name 
		//course num
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("All Classes: ");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("Testing out the 'other' methods: ");
		System.out.println(s1.getClass(2)); //student asking what class he has what period
		System.out.println(Course.compareClassSize(c1, c3)); //comparing class sizes (return the bigger one)
	
	
	}
}
