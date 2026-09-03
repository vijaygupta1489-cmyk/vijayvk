package Single_level;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//protected access modifier can be accessed only in current package
		//where parent class is connected with child class using extends keywords
		
Dept d= new Dept();
d.setColid(101);
d.setCname("ARMIET");
d.setColloc("Mumbai");
d.setDeptname("Comps");

System.out.println("College ID :- "+d.getColid());
System.out.println("College Name:- "+d.getCname());
System.out.println("College Loc:- "+d.getColloc());

System.out.println("Dept ID:-"+d.getDeptid());
System.out.println("Dept Name:- "+d.getDeptname());
	}

}
