package simplebean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmpBean emp=new EmpBean();
emp.setEmpid(101);
emp.setEmpname("Alex");
emp.setEmpsal(55.08);

System.out.println("EMP ID:- "+emp.getEmpid());
System.out.println("Emp Name:- "+emp.getEmpname());
System.out.println("Emp Sal:- "+emp.getEmpsal());
	}

}
