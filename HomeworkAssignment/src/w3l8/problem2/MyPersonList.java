package w3l8.problem2;

public class MyPersonList {
	public final int INITIAL_LENGTH=4;
	private Person[] strArray;
	private int size;

	public MyPersonList() {
		strArray= new Person[INITIAL_LENGTH];
		size=0;
	}
	
	public void add(Person s){
		if(size == strArray.length) resize();
		strArray[size++] = s;	
	}
	
	public Person get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(Person s){
		for(Person test : strArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	
	public void insert(Person s, int pos){
		if(pos > size) return;
		if(pos >= strArray.length||size+1 > strArray.length) {
			resize();
		}
		Person[] temp = new Person[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;
		
	}
	
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		Person[] temp = new Person[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
		
	}
	
	
	private void resize(){
		int len = strArray.length;
		int newlen = 2*len;
		Person[] temp = new Person[newlen];
		System.arraycopy(strArray,0,temp,0,len);
		strArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(strArray[i]+"\n ");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
	}
	
	
	public int size() {
		return size;
	}
	
	public void sort(){
		
		if(strArray == null || strArray.length <=1) return;
		int len = strArray.length;
		int temp = 0;
		for(int i = 0; i < len; ++i){
			int nextMinPos = minpos(i,len-1);
			swap(i,nextMinPos); 
		}
		
	}
	void swap(int i, int j){
		Person temp = strArray[i];
		strArray[i] = strArray[j];
		strArray[j] = temp;
		
	}
	//find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top){		
		Person m = strArray[bottom];
		int index = bottom;
		for(int i = bottom+1; i <= top; ++i){
			if(strArray[i]!=null)
			if(m.getLast().compareTo(strArray[i].getLast())>=1){
				m = strArray[i];
				index = i;
				
			}
		}
		//return location of min, not the min itself
		return index;
	}
	
	//search a sorted array
		boolean search(String lastName) {
			boolean b = recurse(0,strArray.length-1, lastName);
			return b;
		}


		boolean recurse(int a, int b, String val) {
			int mid = (a+b)/2;
			if(strArray[mid].getLast() == val) return true;
			if(a > b) return false;
			if(val.compareTo(strArray[mid].getLast())>=1) return recurse(mid+1, b, val);
			return recurse(a,mid-1,val);
		}
		
}