package CC_ch10;

public class solution09 {
	/* Given an M*N matrix in which each row and each column is sorted
	 * in ascending order, find an element
	 */
	
	public static boolean findElement(int[][] matrix, int elem){
		int row = 0;
		int col = matrix[0].length - 1;
		while (row < matrix.length && col >= 0){
			if(matrix[row][col] == elem){
				return true;
			}else if(matrix[row][col] > elem){
				col--;
			}else{
				row++;
			}
		}
		return false;
	}
	
	public static void main(String[] arg){
		int[][] matrix = {{15,20,70,85},{25,35,80,95},{30,55,95,105},{40,80,120,120}};
		boolean result = solution09.findElement(matrix, 30);
		System.out.print(result);
	}
}
