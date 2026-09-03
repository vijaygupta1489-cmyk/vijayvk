package Multi_hiera;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		Dept d=new Dept();
		Student st=new Student();
		
		System.out.println("enter Dept id");
		d.setDeptid(sc.nextInt());

		System.out.println("Enetr Dept Id");
		d.setDeptname(sc.next());

		System.out.println("Enter Stud id");
		st.setStudid(sc.nextInt());

		System.out.println("Enter Stud name");
		st.setStudname(sc.next());
		

	}

}
