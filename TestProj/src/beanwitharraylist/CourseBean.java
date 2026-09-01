package beanwitharraylist;

public class CourseBean 
{

	private int courseid;
	private String coursename;
	private double coursefees;
	//JavaBeans with ArrayList
	
	// Parameterised Constructor is acting like a Setter Method
		//                       101             JAVA              567
		//Shortcut Key for below right click on current page>Source>>Generate Constructor using field
public CourseBean(int courseid, String coursename, double coursefees) 
		{
			
			this.courseid = courseid;
			this.coursename = coursename;
			this.coursefees = coursefees;
	
	// toString is acting like a Getter Method
	
	//Shortcut Key for below right click on current page>Source>>Generate toString
		}
	//@Override
			
public String toString() 
	{
		return "CourseBean [courseid=" + courseid + ", coursename=" + coursename + ", coursefees=" + coursefees+"]";
	
	}
	
	
	}
	
	//a[]= {12,34,34,55,23,};
	
	//Parameteried constructor is Acting like a Setter Method

