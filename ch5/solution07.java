package ch5;

/**
 * @author- Rui
 * @time - 11:48:32 AM
 * @date - Oct 7, 2015
 * CCAssignments
 */
public class solution07 {
	public int swapBits(int n){
		// using 1010 1010 1010 to mark the even bits (evenMark = 0XAAAA,AAAA represent 32 bits)
		// using 0101 0101 0101 to mark the odd bits (evenMark >>> 1)
		int evenMark = 0xAAAAAAAA;
		return ((n & evenMark) >>> 1) | (n & (evenMark >>> 1)) << 1;  // >>> shows the logical shift fill with high bit 0
	}
	
	public static void main(String[] arg){
		solution07 a = new solution07();
		int num = 29;
		System.out.println(Integer.toBinaryString(num));
		int result = a.swapBits(num);
		System.out.println(Integer.toBinaryString(result));
	}

}
