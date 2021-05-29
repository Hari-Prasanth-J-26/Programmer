//To find the given matrix is upper triangular matrix or not
import java.util.*;
class UpperTriangularMatrix{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		//Getting the number rows from user
		int rows = s.nextInt();
		//Getting the number columns from user
		int cols = s.nextInt();
		int matrix[][] = new int[rows][cols];
		if(rows != cols){
			System.out.println("It is not a square matrix, Please enter the rows and columns value as same");
		}
		else{
			//Getting the elements for a square matrix
			for(int i = 0;i<rows;i++){
				for(int j=0;j<cols;j++){
					matrix[i][j] = s.nextInt();
				}
			}
			int sum = 0;
			
			for(int i = 1;i<rows;i++){
				for(int j=0;j<cols-1;j++){
					if(j<i){
						sum  = sum + matrix[i][j];
					}
				}
			}
			if(sum == 0)
			//It is upper triangular matrix
				System.out.println("Yes");
			else
			//It is not a upper triangular matrix
				System.out.println("No");
		}
		
	}
}
