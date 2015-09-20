package CodingHomework1;

public class solution_1_7 {


	public static void rotate(int[][] matrix,int n){
		
		for(int layer=0;layer< n/2; ++layer){
			int first = layer;
			int last = n-1-layer;
			
			for(int i=first; i<last; ++i){
				int set = i-first;
			
				//save top row
				int top = matrix[first][i];
				
				//move left column to top 
				matrix[first][i] = matrix[last-set][first];
				
				//move bottom to left
				matrix[last-set][first] = matrix[last][last-set];
				
				//move right to bottom
				matrix[last][last-set] = matrix[i][last];
				
				//move top to right
				matrix[i][last] = top;
				
			}
		}
		//return matrix;

			
	}

	
}
