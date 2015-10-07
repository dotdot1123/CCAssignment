package ch5;

/**
 * @author- Rui
 * @time - 11:26:35 AM
 * @date - Oct 7, 2015
 * CCAssignments
 */
public class solution06 {
	// check how many bits you need to flip when covert integer A into integer B
	// this question, we can check each bit of A and B and count the difference of these two integers
	public int convertA2B(int a, int b){
		int count = 0;
		while(a != 0 || b != 0){    // meet the condition will go into, a != 0, b != 0, a b all !=0
			int bitA = a & 1;
			int bitB = b & 1;
			if(bitA != bitB){
				count++;
			}
			a = (a >> 1);
			b = (b >> 1);
		}
		
		return count;
	}
	
	public static void main(String[] arg){
		solution06 a = new solution06();
		int result = a.convertA2B(29, 15);
		System.out.println(result);
	}
}
