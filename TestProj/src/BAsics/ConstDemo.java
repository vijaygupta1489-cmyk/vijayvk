package BAsics;

public class ConstDemo {

	//Constructor name should be same as that of class name
	//Constructor does not have return statement
	//we can create only one constructor in same class
	//Constructor are of 2 types:
	//1.Default Constructor
	//2. Parameterised Constructor
	
	//Default Constructor
	ConstDemo()
	{
		int a=5, b=10;
		System.out.println("Addition "+(a+b));
	}
	public void sub()
	{
	   int a=10, b=6;
	   System.out.println("SUB IS "+(a-b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ConstDemo c= new ConstDemo();
       c.sub();
	}

}
