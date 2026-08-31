package Beanwithotherbean;

public class PersonBean 
{
/*
  Bean with other Bean
  Aggregation Relationship
  Indirect Relationship
  HAS-A Relationship
  Wrapper Class
 */
	
private int pid;
private String pname;
public int getPid()
{
return pid;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public void setPid(int pid) {
	this.pid = pid;
}

@Override
public String toString() {
	return "PersonBean [pid=" + pid + ", pname=" + pname + "]";
}

{
	
}
}
