package w1l5.problem2;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
	
	private int numberOfPublications;
	
	public Professor(String name, LocalDate hireDate, double salary, int numberOfPublications) {
		// TODO Auto-generated constructor stub
		super(name, hireDate, salary);
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

}
