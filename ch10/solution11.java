package CC_ch10;

import java.util.Arrays;

public class solution11 {
	public static void sortValleyPeak(int[] array){
		Arrays.sort(array);
		for(int i = 1; i < array.length; i += 2){
			swap(array, i - 1, i);
		}
	}
	
	public static void swap(int[] array, int left, int right){
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	
	public static void main(String[] arg){
		int[] a = {0,1,4,7,8,9};
		solution11.sortValleyPeak(a);
		printArray.printArrayOut(a);
	}

}
