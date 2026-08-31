package BAsics;

public class ParameterisedConst {
//25-08-2026
		//Parameterised Constructor
		ParameterisedConst(int a, int b)
		{
	
			System.out.println("Addition "+(a+b));
		}
		public void sub()
		{
		   int a=10, b=6;
		   System.out.println("SUB IS "+(a-b));
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       ParameterisedConst c= new ParameterisedConst(15,5);
	       c.sub();
		}

}
