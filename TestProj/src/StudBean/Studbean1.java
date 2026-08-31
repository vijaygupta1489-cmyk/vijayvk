package StudBean;

public class Studbean1 {

	private int studrollno; //101
	private String studname;
	private double studfees;

	//SETTER METHOD
	public void setstudrollno(int studid)
	{
	this.studrollno= studid;  //101

	}
	//GETTER METHOD    101
	public int getstudrollno()
	{
		return studrollno;
	}
	public void setstudname(String name)
	{
	this.studname=name;  //101

	}
	//GETTER METHOD    101
	public String getstudname()
	{
		return studname;
	}
	public void setstudfees(double fees)
	{
	this.studfees=fees;  //101
	}

	//GETTER METHOD    101
	public double getstudfees()
	{
		return studfees;
	}
	}

