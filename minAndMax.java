// find the minimum and maximum element with their index number from given array


public class minAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {99,12, 46, 9, 27, 2,37};
		findminandmax(numbers);

	}

	private static void findminandmax(int[] numbers) {
		// TODO Auto-generated method stub
		if(numbers == null || numbers.length==0)
		{
			System.out.println("Array is empty");
			return;
		}
		int min= numbers[0];
		int max=numbers[0];
		int minindex=0;
		int maxindex=0;
		
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]<min) {
				min=numbers[i];
				minindex=i;	
			}else if(numbers[i]>max) {
				max=numbers[i];
				maxindex=i;	
			}
		}
		System.out.println("Minimum :"+min+" at index"+minindex);
		System.out.println("Maximum :"+max+" at index"+maxindex);
	}
}
