package CodingHomework1;

public class solution_1_8 {
	public static void ZeroMatrix(int[][] Matrix, int M, int N){
		
		boolean[] row = new boolean[M];
		boolean[] col = new boolean[N];
		
		//find the element is 0 and save the index
		for(int i = 0; i < M; i++){
			for(int j = 0;j < N; j++){
				if(Matrix[i][j] == 0){
					row[i] = true;
					col[j] = true;
					}
				}
			}
		
		 for(int i = 0; i<row.length; i++ ){
			 if(row[i])
				 clearRow(Matrix,M,N,i);
		 }
		 
		 for(int i = 0; i<col.length; i++ ){
			 if(col[i])
				 clearCol(Matrix,M,N,i);
		 }
		 
	}
		 
	   //    function to clear row
		  static void clearRow(int[][] Matrix,int M,int N, int row){
				for(int j=0;j<N;j++){
					 Matrix[row][j]=0;
					 }
			}
				
		 //   function to clear row
		  static void clearCol(int[][] Matrix,int M,int N, int col){
				 for(int i=0;i<M;i++){
					 Matrix[i][col]=0;
					 }
			 }
		
}	
		
		
