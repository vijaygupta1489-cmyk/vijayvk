package StudBean;

import java.util.Scanner;

public class Studbean1MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
		
Studbean1 stud=new Studbean1();

System.out.println("Enter your studrollno:-");
stud.setstudrollno(sc.nextInt());

System.out.println("Enter your studname:-");
stud.setstudname(sc.next());

System.out.println("Enter your studfees:-");
stud.setstudfees(sc.nextDouble());

System.out.println("Stud rollno:- "+stud.getstudrollno());
System.out.println("Stud Name:- "+stud.getstudname());
System.out.println("stud fees:- "+stud.getstudfees());

	}

}
