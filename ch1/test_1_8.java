package CodingHomework1;

public class test_1_8 {
	public static void main(String[] str){
		//1.8
				System.out.println("result of 1.8");
				int[][] a_8={{1,2,3,4},{5,6,0,8},{9,10,11,12},{13,14,15,16},{1,0,4,3}};
				int M=5, N=4;
				solution_1_8.ZeroMatrix(a_8, M, N);
				for(int i=0;i<M;i++){
					for(int j=0;j<N;j++){
						System.out.print(a_8[i][j]+" ");
						}
					System.out.println();
					}
		
	}

}
