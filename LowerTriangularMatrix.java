//To check the given matrix is lower triangular matrix or not
import java.util.*;
class LowerTriangularMatrix{
	public static void IsUpperTriangular(int matrix[][], int rows, int cols){
		int sum = 0;
		for(int i=0;i<rows-1;i++){
			for(int j=1;j<cols;j++){
				if(j>i)
					sum+=matrix[i][j];
			}
		}
		if(sum == 0)
			//It is a lower triangular matrix
			System.out.println("Yes");
		else
			//It is a not lower triangular matrix
			System.out.println("No");
					
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
		//Getting the number of rows from user
		int rows = s.nextInt();
		//Getting the number of columns from user
		int cols = s.nextInt();
		int matrix[][] = new int [rows][cols];
		if(rows!=cols){
			System.out.println("It is not a square matrix, Please enter the same values for both  rows and columns");
		}
		else{
			//Getting the elements for a square matrix
			for(int i=0;i<rows;i++){
				for(int j=0;j<cols;j++){
					matrix[i][j] = s.nextInt();
				}
			}
			//Checking the matrix
			IsUpperTriangular(matrix, rows, cols);
			
		}
	}
}
		
