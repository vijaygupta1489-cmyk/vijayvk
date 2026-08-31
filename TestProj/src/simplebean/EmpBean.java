package simplebean;

public class EmpBean {
/*
 //26-08-2026
 Java Beans is concept where we store values inside the
  variables indirectly with the help of setter and getter method
  
  SETTER METHOD:- is used to store values inside the variable 
  GETTER METHOD:- is used to get or print from the variable 
  
  SETTER METHOD:- METHOD WITH PARAMETERS
  GETTER METHOD:- METHOD WITHOUT VOID
  
  Java beans makes the code more secured(like: Bank application)
  this- keyword is used to share value of parameter with private variable
 */
	
private int empid; //101
private String empname;
private double empsal;

//SETTER METHOD
public void setEmpid(int id)
{
this.empid=id;  //101

}
//GETTER METHOD    101
public int getEmpid()
{
	return empid;
}
public void setEmpname(String name)
{
this.empname=name;  //101

}
//GETTER METHOD    101
public String getEmpname()
{
	return empname;
}
public void setEmpsal(double sal)
{
this.empsal=sal;  //101
}

//GETTER METHOD    101
public double getEmpsal()
{
	return empsal;
}
}
