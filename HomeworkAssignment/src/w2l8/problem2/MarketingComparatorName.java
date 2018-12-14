package w2l8.problem2;

import java.util.Comparator;

public class MarketingComparatorName implements Comparator<Marketing>{
	
	@Override
	public int compare(Marketing m1, Marketing m2) {
		if(m1.employeename.compareTo(m2.employeename)!=0)
			return m1.employeename.compareTo(m2.employeename);
		else if(Double.compare(m1.salesamount,m2.salesamount)!=0)
			return Double.compare(m1.salesamount, m2.salesamount);
		else
			return m1.productname.compareTo(m2.productname);
	}

}
