package ch5;

import java.util.ArrayList;

/**
 * @author- Rui
 * @time - 10:06:12 AM
 * @date - Oct 7, 2015
 * CCAssignments
 */
public class solution03 {
	public int flipToWin(int x) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int length = 0;
		int maxLength = 0;
		while(x != 0) {
			if((x & 1) == 1) {
				length++;
			} else {
				arrayList.add(length);  // include each continue number of 1
				length = 0;
			}
			x = x>>1;
		}
		
		for(int i = 0; i < arrayList.size() - 1; i++) {    // find the adjacent large numbers 
			int temp = arrayList.get(i) + arrayList.get(i + 1);
			if(temp > maxLength) maxLength = temp;
		}
		return maxLength + 1;
	} 
	
	public static void main(String[] args) {
		solution03 a = new solution03();
		System.out.println(a.flipToWin(1775));
	}

}
