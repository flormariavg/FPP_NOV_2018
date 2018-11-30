package w1l3.prog3_5;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyDate {
	
	public static final String DATE_PATTERN= "MM/dd/yyyy";
	public static final String DATE_PATTER_2= "MMMM dd, yyyy";
	public static final String DATE_PATTERN_3= "DDD yyyy";

	public static String localDateAsString(LocalDate date, String pattern) {
		return date.format(DateTimeFormatter.ofPattern(pattern));
	}
	
	public MyDate(int mm, int dd, int yyyy) {
		LocalDate date= LocalDate.of(yyyy, mm, dd);
		System.out.println("MM/dd/yyyy: "+localDateAsString(date, DATE_PATTERN));
		
	}
	public MyDate(String month, int dd, int yyyy) {
		System.out.println("MMMM dd,yyyy: "+localDateAsString(LocalDate.of(yyyy, Month.valueOf(month.toUpperCase()), dd), DATE_PATTER_2));
	}
	public MyDate(int ddd, int yyyy) {
		System.out.println("DDD yyyy: "+localDateAsString(LocalDate.ofYearDay(yyyy, ddd),DATE_PATTERN_3));
	}
	
	public static void main(String[] args) {
		String answer;
		
		do {
			MyDate myDate;
			int y,m,d;
			String month;
			Scanner s = new Scanner(System.in);
			LocalDate date;
			System.out.print("Enter 1 for format: MM/DD/YYYY\nEnter 2 for format: Month DD, YYYY\n" + 
					"Enter 3 for format: DDD YYYY\nEnter 4 to exit\nChoose your Choice : ");
			answer= s.nextLine().toString();
			System.out.print("\nChoice:");
			switch(answer) {
				case "1":
					System.out.print(answer);
					System.out.print("\nEnter Month: ");
					m=Integer.parseInt(s.nextLine());
					System.out.print("Enter Day: ");
					d=Integer.parseInt(s.nextLine());
					System.out.print("Enter Year: ");
					y=Integer.parseInt(s.nextLine());
					
					date= LocalDate.of(y, m, d);
					new MyDate(m, d, y);		
					new MyDate(date.getMonth().toString(), d, y);		
					new MyDate(date.getDayOfYear(), y);
					
					break;
				case "2":
					System.out.print(answer);
					System.out.print("\nEnter Month in text: ");
					month=s.nextLine().toString();
					System.out.print("Enter Day: ");
					d=Integer.parseInt(s.nextLine());
					System.out.print("Enter Year: ");
					y=Integer.parseInt(s.nextLine());
					
					date= LocalDate.of(y, Month.valueOf(month.toUpperCase()), d);	
					new MyDate(date.getMonthValue(), d, y);
					new MyDate(month, d, y);		
					new MyDate(date.getDayOfYear(), y);
					
					
					break;
				case "3":
					System.out.println("Enter Day of Year:");
					d=Integer.parseInt(s.nextLine());
					System.out.println("Enter Year: ");
					y=Integer.parseInt(s.nextLine());
					
					date= LocalDate.ofYearDay(y, d);
					
					new MyDate(date.getMonthValue(), date.getDayOfMonth(), date.getYear());
					new MyDate(date.getMonth().toString(), date.getDayOfMonth(), date.getYear());
					new MyDate(d, y);
					
					break;
				default: answer="n";
			}
			if(answer!="n") {
				System.out.print("\nDo you want to Continue (y/n):");
				answer= s.nextLine().toString();
			}
				
			
		}while(answer.toLowerCase().equals("y"));
		
		System.out.println("Terminated");
		
		/*
		 * Enter 1 for format: MM/DD/YYYY
			Enter 2 for format: Month DD, YYYY
			Enter 3 for format: DDD YYYY
			Enter 4 to exit
			Choose your Choice : 1
			
			Choice:1
			Enter Month: 12
			Enter Day: 28
			Enter Year: 2015
			MM/dd/yyyy: 12/28/2015
			MMMM dd,yyyy: December 28, 2015
			DDD yyyy: 362 2015
			
			Do you want to Continue (y/n):y
			Enter 1 for format: MM/DD/YYYY
			Enter 2 for format: Month DD, YYYY
			Enter 3 for format: DDD YYYY
			Enter 4 to exit
			Choose your Choice : 2
			
			Choice:2
			Enter Month in text: January
			Enter Day: 26
			Enter Year: 2014
			MM/dd/yyyy: 01/26/2014
			MMMM dd,yyyy: January 26, 2014
			DDD yyyy: 026 2014
			
			Do you want to Continue (y/n):y
			Enter 1 for format: MM/DD/YYYY
			Enter 2 for format: Month DD, YYYY
			Enter 3 for format: DDD YYYY
			Enter 4 to exit
			Choose your Choice : 3
			
			Choice:Enter Day of Year:
			221
			Enter Year: 
			2016
			MM/dd/yyyy: 08/08/2016
			MMMM dd,yyyy: August 08, 2016
			DDD yyyy: 221 2016
			
			Do you want to Continue (y/n):n
			Terminated

			
		 */
	}
}
