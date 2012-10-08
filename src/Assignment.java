import java.util.Date;

/**
 * 
 */

/**
 * @author student
 *
 */
public class Assignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// what happened to everything??
		
		String[] values = new String[0];
		if( args.length > 1 ) 
		{
			values = new String[args.length-1]; 
			for( int i=1; i<args.length; i++ ) {
				values[i-1] = args[i];
			}
		}
			
		System.out.println(getElement( values, 1).toString());
		Task t2 = new Task(2, (new String("Hello World!")));
//		Task t2 = new Task();
		System.out.println(t2.toString());
		return;
//		if( action.equals("for-each") ) { testForEach(values);
//		}
//		else if( action.equals("for") ) {
//		testFor(values);
//		}
//		else if( action.equals("while") ) {
//		}
//		}
//		else {
//		testWhile(values);
//		System.out.println(action+" not found");
//		}
	}
	
	
//	Assignment
//	Read chapter 7 in Java: A Beginner's Guide
//	Programming assignment
//	Create a github repository to hold homework.  It should be named bma-week-5.  It should contain an Assignment.java file
//	Implement the following static method "static String getElement(String values, int index)"
//	If the index is not a valid array index, return null
//	In the future we'll try to avoid this, but we currently don't have error handling in our toolbox
//	Otherwise, return the array element at the index
	
//	TODO left off here 100412
//	Implement a class named Task inside the Assignment.java file
//	Do not create a new file.  Place the Task class immediately after the end of the Assignment class in Assignment.java
//	Do not implement a main method in Task.
//	Add the instance variables you think belong in a Task object
//	Implement at least one parameterized constructor for the Task class
//	Implement a no-argument constructor for the Task class
//	Implement a main() method in the Assignment class that does the following
//	Call every constructor implemented in Task at least once, assigning the resulting object to a variable
//	Pass each Task object created to "System.out.println(aTask);"
//	Try to run Assignment
//	Why didn't it work?  The compiler has no idea how to convert a Task object into a String
//	Implement a toString() method in Task
//	The signature has to be "public String toString()" exactly
//	Create a String representation of a Task.  This does not need to display every piece of data in the class, just the core information.  "Task(title)" would be a sparse but acceptable implementation.
//	Try to run Assignment again
//	It should work.  If not, try debugging.  If that fails, send an email

//	
	public static String getElement(String[] values, int index)
	{
		if (index < values.length)
		{
			return(values[index]);
		}
		return null;
		
	}



}
/***
 * 
 * @author student
 *
 */
class Task {
	int priority;
	String name;
	Date dueDate;
	
	public Task() {}
	
	public Task(int priority, String name)
	{
		this.priority = priority;
		this.name = name;
			
	}
	
	public String toString()
	{
		return("#" + priority + " "+ name);
	}
	
	
}

