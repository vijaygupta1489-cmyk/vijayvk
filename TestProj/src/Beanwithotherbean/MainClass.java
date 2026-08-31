package Beanwithotherbean;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		PersonBean p=new PersonBean();
		p.setPid(84843);
		p.setPname("Alex");
		
		System.out.println("Person ID:- "+p.getPid());
		System.out.println("Person name:- "+p.getPname());
		
		ProfBean pr=new ProfBean();
		
		System.out.println("Enter Prof ID:-");
		pr.setProfid(sc.nextInt());
		
		System.out.println("Enter Prof Name");
		pr.setProfname(sc.next());
		
		pr.setPb(p);
		
		//pr.setProfid(1232);
		//pr.setProfname("jon");
		//pr.setPb(p);
		
		//p is object of PersonBean
		
		System.out.println("Prof ID:- "+pr.getProfid());
		System.out.println("Prof Name:- "+pr.getProfname());
		System.out.println(pr.getPb());
		
/*
 Assignment no.1
 
 BankBean
 bankID
 bankName
 bankLoc
 
 AccountBean:- BankBean should be declared as variable
 AccID
 AccName
 
 CustomerBean:- BankBean should be declared as variable 
 CustID
 CustName
 Bank_bal
 */
	}

}
