import java.util.Arrays;

public class avereage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {9,5,2,67,1,90,33,1,67};
		System.out.println("Original Array Is :"+Arrays.toString(numbers));
		// reverse the array
		int []reversedNumbers=reversedArray(numbers);
		System.out.println("Reverse Array Is :"+Arrays.toString(reversedNumbers));
		// calculate the average
		double average=calculateAverage(reversedNumbers);
		System.out.println("Average Of Reversed Array:"+average);
		// sort array in ascending order
		Arrays.sort(numbers);
		System.out.println("Sorted Array :"+Arrays.toString(numbers));	
	}
      public static int[]reversedArray(int[] array){
    	  int[]reversed=new int[array.length];
    	  for(int i=0; i<array.length;i++) {
    		  reversed[i]=array[array.length-i-1];
    	  }
    	  return reversed;
      }
      public static double calculateAverage(int[] array) {
    	  int sum=0;
    	  for(int num :array) {
    		  sum+=num;
    	  }
    	  return(double)sum/array.length;
      }
      
}
