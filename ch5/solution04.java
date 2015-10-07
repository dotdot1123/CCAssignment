package ch5;

/**
 * @author- Rui
 * @time - 10:31:48 AM
 * @date - Oct 7, 2015
 * CCAssignments
 */
public class solution04 {
	// get the total numbers of 1
	public int[] countOneNumber(int num){
		int[] count = new int[2];
		count[0] = 0;     // count[0] the total numbers of 1
		count[1] = 0;     // count[1] the total bits of the number
		while(num != 0){
			count[1]++;
			if((num & 1) == 1){
				count[0]++;
			}
			num = num >> 1;
		}
		return count;
	}
	
	// the smallest number is all 1 order the right position  eg: 0000,0111(if count = 3)
	 public int smallestNumber(int num){
		 solution04 a = new solution04();
		 int[] count = a.countOneNumber(num);
		 return (1 << count[0]) - 1; 
	 }
	 
	// the smallest number is all 1 order the left position  eg 1110,0000(if count = 3)
	 public int largestNumber(int num){
		 solution04 a = new solution04();
		 int[] count = a.countOneNumber(num);
		 int value = 0;
		 for(int i = 1; i <= count[0]; i++){
			 value += (1 << (count[1] - i));  // 1000,0000 + 100,0000 + 10,0000
		 }
		 return value;
	 }
	 
	 public static void main(String[] args){
		 solution04 a = new solution04();
		 int num = 1775;
		 System.out.println("The original number is "+ Integer.toBinaryString(num));
		 int smallestValue = a.smallestNumber(num);
		 int largestValue = a.largestNumber(num);
		 System.out.println("The smallest number is "+ Integer.toBinaryString(smallestValue));
		 System.out.println("The largest number is "+ Integer.toBinaryString(largestValue));
	 }
	 
	 
}
