package Beanwithotherbean;

public class ProfBean 
{
//one class is declared as a variable in other class
	
	private int profid;
	private String profname;
	private PersonBean pb;
	public int getProfid()
	{
		return profid;
	}
	public void setProfid(int profid) {
		this.profid = profid;
	}
	public String getProfname() {
		return profname;
	}
	public void setProfname(String profname) {
		this.profname = profname;
	}
	public PersonBean getPb() {
		return pb;
	}
	public void setPb(PersonBean pb) {
		this.pb = pb;
	}
	
	
}
