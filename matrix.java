
// addition of two matrix to print the 3rd matrix
import java.util.*;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows1,rows2,cols1,cols2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows for matrix 1 :");
		rows1=sc.nextInt();
		System.out.println("Enter the number of columns 1 :");
		cols1=sc.nextInt();
		System.out.println("Enter the number of rows for matrix 2 :");
		rows2=sc.nextInt();
		System.out.println("Enter the number of columns 2 :");
		cols2=sc.nextInt();
		if (rows1!=rows2 ||cols1!=cols2 ) {
			System.out.println("Erro: Matrices must have the same dimensions for addition " );
			return;
		}
		int[][]matrix1=new int[rows1][cols1];
		int[][]matrix2=new int[rows2][cols2];
		int[][]result=new int[rows1][cols1];
		System.out.println("Enter the elements of matrix 1:");
		for(int i=0; i<rows1; i++) {
			for(int j=0; j<cols1; j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of matrix 2:");
		for(int i=0; i<rows2; i++) {
			for(int j=0; j<cols2; j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<rows1; i++) {
			for(int j=0; j<cols1; j++) {
				result[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		
		System.out.println("The sum of matrices is :");
		for(int i=0; i<rows1; i++) {
			for(int j=0; j<cols1; j++) {
				System.out.println(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
