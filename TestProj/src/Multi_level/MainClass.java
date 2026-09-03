package Multi_level;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
Student st=new Student();

System.out.println("enter college name");
st.setCname(sc.next());

System.out.println(" Enter College Id");
st.setColid(sc.nextInt());

System.out.println("enter college ");
st.setColloc(sc.next());

System.out.println("enter Dept id");
st.setDeptid(sc.nextInt());

System.out.println("Enetr Dept Id");
st.setDeptname(sc.next());

System.out.println("Enter Stud id");
st.setStudid(sc.nextInt());

System.out.println("Enter Stud name");
st.setStudname(sc.next());
/*
System.out.println("College ID :- "+st.getColid());
System.out.println("College Name:- "+st.getCname());
System.out.println("College Loc:- "+st.getColloc());

System.out.println("Dept ID:-"+st.getDeptid());
System.out.println("Dept Name:- "+st.getDeptname());

System.out.println("Stud id:-"+st.getStudid());
System.out.println("Stud Name:-"+st.getStudname());
*/

	}

}
