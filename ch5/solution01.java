package ch5;

/**
 * @author--Rui
 * @date --Oct 7, 2015
 * CCAssignments
 */
public class solution01 {
	public int updateBits(int N, int M, int i, int j){ // promise the bits of M is less or equal to j-i
		int a = ~0;   // the bits of a is all 1
		int high = a << (j + 1);   //get the high bit(left of j) of a is all 1
		int low = (1 << i -1);     //get the low bit(right of j) of a is all 1
		int cleanM = high | low;    // get the number with middle M bits are all zero
		int newN = cleanM & N;      // get the number N with the middle M bits are zero
		int shiftM = M << i;  // shift M match the position it should insert
		return newN | shiftM;
	}
	
	public static void main(String[] arg){
		int N = 0x400;
		int M = 0x13;
		int i = 2;
		int j = 6;
		solution01 a = new solution01();
		int result = a.updateBits(N, M, i, j);
		System.out.println(Integer.toBinaryString(result));
	}

}
