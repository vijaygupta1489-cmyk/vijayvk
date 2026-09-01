package beanwitharraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Course ID, Course Name, Course Fees");
		
		CourseBean cb=new CourseBean(sc.nextInt(), sc.next(), sc.nextDouble());
		
//CourseBean cb=new CourseBean(101,"Java", 3454);
//this data is used for storing in private variable

ArrayList<CourseBean> a= new ArrayList<CourseBean>();

//ArrayList is predefined class from java.util package

//Following data will be stored in ArrayList

System.out.println("Enter Course ID , CourseName, Course Fees");
a.add(new CourseBean(sc.nextInt(), sc.next(),sc.nextDouble()));

System.out.println("Enter Course ID , CourseName, Course Fees");
a.add(new CourseBean(sc.nextInt(),sc.next(),sc.nextDouble()));
a.add(cb);

Iterator<CourseBean> iter=a.iterator();
//iterator is predefined Interface from java.util package
//hasNext() is predefined method of Iterator
//it is used to check whether Iterator has records stored or not 


while(iter.hasNext())
{
	System.out.println(iter.next()); //i++
	
}
	}

}
