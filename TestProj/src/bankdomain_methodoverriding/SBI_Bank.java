package bankdomain_methodoverriding;

public class SBI_Bank extends Bank{

	public void calculateInterest(double principal, double time)
	{
		double rate=5.6;
				double intrest =(principal*time*rate)/100;
		System.out.println("Bank Interest: -"+ intrest);
	}
}
