// search number from given 2d matrix


public class towDMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={ {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13, 14, 15, 16}};
		int target=66;
		System.out.println("Number found :"+searchNumber(matrix, target));

	}

	private static boolean searchNumber(int[][] matrix, int target) {
		// TODO Auto-generated method stub
		if(matrix == null || matrix.length==0) {
			return false;
		}
		
	int rows= matrix.length;
	int cols=matrix[0].length;
	for(int i=0; i<rows; i++) {
		for(int j=0; j<cols; j++) {
			if(matrix[i][j]==target) {
				return true;
			}
		}
	}
	return false;
}
}
