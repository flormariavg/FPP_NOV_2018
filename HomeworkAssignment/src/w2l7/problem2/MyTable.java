package w2l7.problem2;

/**
 * 
 * @author flormaria
 *
 */
public class MyTable {
	private Entry[] entries = new Entry[26];

	//returns the String that is matched with char c in the table
	public String get(char c) {
		//implement
		int pos= Integer.valueOf(c)-97;
		return entries[pos].getStr();
	}

	//adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		//implement
		int pos= Integer.valueOf(c)-97;
		
		if(s.toLowerCase().charAt(0)==c)
			entries[pos]=new Entry(c, s);
		else
			System.out.println("The name have to start with: "+ c);
	}

	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		//implement
		StringBuilder sb = new StringBuilder();
		for(Entry e: entries) {
			if(e!= null) {
				sb.append(e.toString());
				sb.append("\n");
			}
		}
				
		return sb.toString();
	}

	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		
		System.out.println(t);
	}
	private class Entry {
		private char ch;
		private String str;
		
		Entry(char ch, String str) {
			//implement
			this.ch=ch;
			this.str=str;
		}

		//returns a String of the form "ch->str"
		public String toString() {
			//implement
			return ch+"->"+str;
		}

		public String getStr() {
			return str;
		}
	}
	/*
	 * OUTPUT:
	 * 
	 * 	a->Andrew
		b->Billy
		w->Willie

	 */
}
