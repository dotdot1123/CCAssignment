package CC_ch10;

public class solution06 {
	//imagine you have a 20GB file with one string per line. Explain how you would sort the file.
	
	
	/*
	 *  diving the file into chunks, which are x megabytes each, where x is the amount of memory we have
	 *  available. each chunk is sorted separately and then saved back to the file system.
	 *  once all the chunks are sorted, we merge the chunks, one by one. 
	 * 
	 *  the process is below:
	 *  1. Divide your memory into (N+1) parts. First N data parts are used for reading data 
	 *  from N chunks, the last one is a buffer
	 *  2. Load data to fill the first N data parts from N chunks respectively, perform an 
	 *  N-way merge sort to the buffer.
	 *  3. While each data part is not empty, perform the sort. If any data part is empty, load
	 *  new content from the according chunk.
	 *  4. While the buffer is not full, perform the sort. If the buffer is full, write buffer
	 *  to the disk, clear buffer.
	 *  5. Repeat step 3-4 until all N chunks are empty.
	 *  
	 *  At the end, we have a fully sorted file. This is known as external sort.
	 *  
	 */
	
	// mergesort
		void mergesort(int[] array){
			int[] helper = new int[array.length];
			mergesort(array, helper, 0, array.length - 1);
		}
		void mergesort(int[] array, int[] helper, int low, int high){
			if(low < high){
				int middle = (low + high) / 2;
				mergesort(array, helper, low, middle); //left
				mergesort(array, helper, middle + 1, high); //right
				merge(array, helper, low, middle, high); // all together
			}
		}
		void merge(int[] array, int[] helper, int low, int middle, int high){
			for(int i = low; i <= high; i++){
				helper[i] = array[i];
			}
			int helperLeft = low;
			int helperRight = middle + 1;
			int current = low;
			
			while(helperLeft <= middle && helperRight <= high){
				if(helper[helperLeft] <= helper[helperRight]){
					array[current] = helper[helperLeft];
					helperLeft++;
				}else{
					array[current] = helper[helperRight];
					helperRight++;
				}
				current++;
			}
			int remaining = middle - helperLeft;
			for(int i = 0; i <= remaining; i++){
				array[current + i] = helper[helperLeft + i];
			}
	}
}
