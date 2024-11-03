// given an array of integers and one integer value as target sum, return the indexes of two elements that add up to the target value

import java.util.Arrays;
public class indexElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {2,7,11,15};
		int targetsum =9;
		int [] result= twosum(numbers, targetsum);
		System.out.println("Indices :"+result[0]+","+result[1]);
	}

	private static int[] twosum(int[] numbers, int targetsum) {
		// TODO Auto-generated method stub

        int[] sortedNumbers=numbers.clone();
		Arrays.sort(sortedNumbers);
		int left=0;
		int right=sortedNumbers.length-1;
		while(left < right) {
			int sum=sortedNumbers[left]+sortedNumbers[right];
			if(sum== targetsum) {
				//find original indices
				int index1= findindex(numbers, sortedNumbers[left]);
				int index2= findindex(numbers, sortedNumbers[right]);
				return new int[] { index1, index2};	
			}else if(sum <targetsum) {
				left++;
			}else {
				right--;
			}
		}
		throw new RuntimeException("No solution found"); 
	}
	private static int findindex(int[] numbers, int target) {
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]== target) {
				return i;
			}
		}
		throw new RuntimeException(" index not found");
	}

}
