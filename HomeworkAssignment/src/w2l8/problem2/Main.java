package w2l8.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author flormaria
 *
 */
public class Main {
	
	public static List<Marketing> listMoreThan1000(List<Marketing> list){
		
		List<Marketing> temp= new ArrayList<>();
		for(Marketing m: list) {
			if(m.salesamount>1000 )
				temp.add(m);
		}
		
		list= temp;
		Collections.sort(list, new MarketingComparatorName());
		return list;
	}

	
	public static void main(String[] args) {
		List<Marketing> mlist= new ArrayList<>();
		
		mlist.add(new Marketing("Jhon", "Lenovo",800 ));
		mlist.add(new Marketing("Jhon", "Lenovo",800 ));
		mlist.add(new Marketing("Ann", "Apple",1500 ));
		mlist.add(new Marketing("Jhon", "Lenovo",8000 ));
		mlist.add(new Marketing("Ann", "Apple",1500 ));
		mlist.add(new Marketing("Andres", "HP",20000 ));
		
		System.out.println("a: Elements adding in the list:");
		System.out.println(mlist);
		
		System.out.println("\nb: Remove the element "+mlist.get(2));
		mlist.remove(2);
		
		System.out.println("\n d: Elements in the list after remove:");
		System.out.println(mlist);
		
	
		System.out.println("\nc: Number of elements in the list: "+mlist.size()+"\n");
		
		if(mlist.get(0).equals(mlist.get(3)))
			System.out.println("Both elements in the list are equals");
		else
			System.out.println("The elements in the list are not equals");
		
		MarketingComparator mc= new MarketingComparator();
		
		if(mc.compare(mlist.get(0), mlist.get(3))==0)
			System.out.println("e: Both elements in the list are equals using comparator");
		else
			System.out.println("e: The elements in the list are not equals using comparator");
		
		System.out.println("\nf: Sort list: ");
		Collections.sort(mlist, new MarketingComparator());
		System.out.println(mlist);
		
		System.out.println("\ng: The employees who achieves more than $1000: ");
		
		System.out.println(listMoreThan1000(mlist));
		
	}
	
	/*
	 * OUTPUT:
	 * 	a: Elements adding in the list:
		[Employee name: Jhon, Product name: Lenovo, Sales amount: 800.0
		, Employee name: Jhon, Product name: Lenovo, Sales amount: 800.0
		, Employee name: Ann, Product name: Apple, Sales amount: 1500.0
		, Employee name: Jhon, Product name: Lenovo, Sales amount: 8000.0
		, Employee name: Ann, Product name: Apple, Sales amount: 1500.0
		, Employee name: Andres, Product name: HP, Sales amount: 20000.0
		]
		
		b: Remove the element Employee name: Ann, Product name: Apple, Sales amount: 1500.0
		
		
		 d: Elements in the list after remove:
		[Employee name: Jhon, Product name: Lenovo, Sales amount: 800.0
		, Employee name: Jhon, Product name: Lenovo, Sales amount: 800.0
		, Employee name: Jhon, Product name: Lenovo, Sales amount: 8000.0
		, Employee name: Ann, Product name: Apple, Sales amount: 1500.0
		, Employee name: Andres, Product name: HP, Sales amount: 20000.0
		]
		
		c: Number of elements in the list: 5
		
		The elements in the list are not equals
		e: The elements in the list are not equals using comparator
		
		f: Sort list: 
		[Employee name: Jhon, Product name: Lenovo, Sales amount: 800.0
		, Employee name: Jhon, Product name: Lenovo, Sales amount: 800.0
		, Employee name: Ann, Product name: Apple, Sales amount: 1500.0
		, Employee name: Jhon, Product name: Lenovo, Sales amount: 8000.0
		, Employee name: Andres, Product name: HP, Sales amount: 20000.0
		]
		
		g: The employees who achieves more than $1000: 
		[Employee name: Andres, Product name: HP, Sales amount: 20000.0
		, Employee name: Ann, Product name: Apple, Sales amount: 1500.0
		, Employee name: Jhon, Product name: Lenovo, Sales amount: 8000.0
		]

	 */
	
}
