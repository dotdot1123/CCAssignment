package CC_ch10;

public class solution01 {  
	// two given sorted arrays, A and B,  A has large end to hold B, 
	// merge B to A in sorted order
	
	public static void mergeSort(int[] a, int[] b, int lengthA, int lengthB){
		//input A and B, and the length of A and B
		int indexA = lengthA - 1;
		int indexB = lengthB - 1;
		int indexMerge = lengthA + lengthB - 1;  // sort result save into A
		while(indexB >= 0){                //indexB must be less than indexA,if indexB is 0, a have been ordered
		if(a[indexA] > b[indexB] && indexA >= 0){
			a[indexMerge] = a[indexA];
			indexA--;
		}
		else{
			a[indexMerge] = b[indexB];
			indexB--;
		}
		indexMerge--;	
		}
	}
	
	public static void main(String[] arg){
		int[] a = new int[]{1,2,3,7,8,9,10,11,12,0,0,0,0,0};  // a length must longer than a.length + b.length
		int[] b = new int[]{4,5,6};
		mergeSort(a,b,9,3);   
		for(int i=0;i<=11;i++){  //print merge sort order  
			System.out.print(a[i]+" ");
		}
	}
	

}
