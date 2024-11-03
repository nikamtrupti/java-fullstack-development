// duplicate number in given array


import java.util.Arrays;

public class duplicate {

	private static void findDuplicatesUsingSorting(int[] array) {
		// TODO Auto-generated method stub
		Arrays.sort(array);
		for(int i=0; i<array.length-1; i++) {
			if(array[i]==array[i+1]) {
				System.out.println(array[i]+" is duplicates");
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {2,88,3,2,44,88,3,2,5};
		System.out.println("\n Duplicates using Sorting");
		findDuplicatesUsingSorting(array);
		
	}


}
