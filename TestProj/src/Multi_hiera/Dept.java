package Multi_hiera;

public class Dept extends College
{
	//extends keyword is used to share all the details protected
		//of parent class with child class
		
		protected int deptid;
		protected String deptname;
		
		public int getDeptid()
		{
			return deptid;
		}

		public String getDeptname() {
			return deptname;
		}

		public void setDeptname(String deptname) {
			this.deptname = deptname;
		}

		public void setDeptid(int deptid) {
			this.deptid = deptid;
		}
		}
		
