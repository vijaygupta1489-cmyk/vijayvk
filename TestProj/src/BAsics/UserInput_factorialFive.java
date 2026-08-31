package BAsics;

import java.util.Scanner;

public class UserInput_factorialFive 
{

public static void main(String[] args) 
{
		// TODO Auto-generated method stub
	Scanner sc=new Scanner (System.in);
	
	System.out.println("Enter the factorial:- ");
	// 5=1*2*3*4*5
	int a= sc.nextInt();
	int f=1;
	
//int a=5, f=1;

for(int i=1; i<=a; i++)
{
	f=f*i ;
			
}
System.out.println("factorial of "+a+" is " +f);
}

}
