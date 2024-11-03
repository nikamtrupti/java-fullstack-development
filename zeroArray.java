import java.util.Arrays;

public class zeroArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {0,1,0,2,3,0};
		movezerosToend(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	private static void movezerosToend(int[] numbers) {
		// TODO Auto-generated method stub
		int nonzeroindex=0;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] !=0) {
				int temp =numbers[nonzeroindex];
				numbers[nonzeroindex]=numbers[i];
				numbers[i]=temp;
				nonzeroindex++;
			}
		}
	}
	

}
