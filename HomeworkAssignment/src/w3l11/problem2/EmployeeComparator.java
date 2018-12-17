package w3l11.problem2;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getSsn().compareTo(e2.getSsn())!=0) 
			return e1.getSsn().compareTo(e2.getSsn());
		if(Integer.compare(e1.getSalary(), e2.getSalary())!=0)
			return Integer.compare(e1.getSalary(), e2.getSalary());
		return e1.getName().compareTo(e2.getName());
	}
	
	

}
