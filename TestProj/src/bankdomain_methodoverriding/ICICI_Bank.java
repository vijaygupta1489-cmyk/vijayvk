package bankdomain_methodoverriding;

public class ICICI_Bank extends Bank {

	public void calculateInterest(double principal, double time)
	{
		double rate=7;
				double intrest =(principal*time*rate)/100;
		System.out.println("Bank Interest: -"+ intrest);
}
}
