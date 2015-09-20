package CodingHomework1;

public class test_1_7 {
	public static void main(String[] str){
		
		//1.7
				System.out.println("result of 1.7");
				int[][] a1={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
				int n=4;
				solution_1_7.rotate(a1,n);
				for(int i=0;i<n;i++){
					for(int j=0;j<n;j++){
						System.out.print(a1[i][j]+" ");
						}
					System.out.println();
						
					}
	}

}
