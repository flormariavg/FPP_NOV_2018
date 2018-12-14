package w2l8.problem2;

import java.util.Objects;

public class Marketing {
	
	String employeename;
	String productname;
	double salesamount;
	
	public Marketing(String employeename, String productname, double salesamount) {
		
		this.employeename= employeename;
		this.productname= productname;
		this.salesamount= salesamount;
	}
	
	@Override
	public String toString() {

		return "Employee name: "+employeename+", Product name: "+productname+", Sales amount: "+salesamount+"\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(!this.getClass().equals(obj.getClass())) return false;
		Marketing  m= (Marketing)obj;
		return employeename.equals(m.employeename) && productname.equals(m.productname)&& salesamount==m.salesamount;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(employeename, productname, salesamount);
	}

}
