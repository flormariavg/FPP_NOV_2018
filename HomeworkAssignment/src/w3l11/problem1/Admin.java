package w3l11.problem1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		Key key;
		HashMap<Key, Student> hm= new HashMap<>();
		for(Student s: students) {
			key=new Key(s.getFirstName(), s.getLastName());
			hm.put(key, s);
		}
		return hm;
	}
}
