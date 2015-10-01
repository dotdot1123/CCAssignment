package CC_ch10;

public class solution03 {
	 // search in rotated array: given a sorted array of n integers that has been rotated an
	// unknown number of times, write code to find an element in the array,you may assume that 
	// the array was originally sorted in increasing order.
	
 	 public static int searchInRotatedArray(int A[], int N, int key) {
			  int L = 0;
			  int R = N - 1;
			 
			  while (L <= R) {
			    // Avoid overflow, same as M=(L+R)/2
			    int M = L + ((R - L) / 2);
			    if (A[M] == key) return M;
			 
			    // the bottom half is sorted
			    if (A[L] <= A[M]) {
			      if (A[L] <= key && key < A[M])
			        R = M - 1;
			      else
			        L = M + 1;
			    }
			    // the upper half is sorted
			    else {
			      if (A[M] < key && key <= A[R])
			        L = M + 1;
			      else 
			        R = M - 1;
			    }
			  }
			  return -1;
			}

	
	public static void main(String[] arg){
		
		int[] a = new int[]{15,16,19,20,25,1,3,4,5,7,10,14};
		int e = searchInRotatedArray(a,12,5);
		System.out.println(e);      // return 5 in the rotated array index
	}

}
