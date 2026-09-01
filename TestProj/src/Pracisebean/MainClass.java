package Pracisebean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudBean st=new StudBean();
st.setVANNUMBER(6558);
st.setVANNAME("Benz");
st.setVANMODEL("mh02");

System.out.println("VAN Number " +st.getVANNUMBER());
System.out.println("VAN Name " +st.getVANNAME());
System.out.println("VANModel " +st.getVANMODEL()) ;
	}

}
