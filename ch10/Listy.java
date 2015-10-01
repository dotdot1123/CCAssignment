package CC_ch10;

public class Listy {
	public int[] a;
	public void Listy(int[] a){
		this.a = a;
	}
	// have a method elementAt(i) returns the element at index i in O(1)
	public int elementAt(int i){
		if(i < a.length) return a[i];
		else return -1;
	}

}
