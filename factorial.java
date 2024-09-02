
// find the factorial of a given number check number is pelimdrome or not
import java.util.*;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number :");
		number=sc.nextInt();
		int factorial=calculatefactorial(number);
		System.out.println("Factorial of"+number+"is:"+factorial);
		boolean isPalindrome=checkPalindrome(factorial);
			
	}

	private static boolean checkPalindrome(int number) {
		int reversesedNumber=0;
		int originalNumber=number;
		while(number >0) {
			int remainder=number %10;
			reversesedNumber=(reversesedNumber *10)+remainder;
			number/=10;
		}
		return originalNumber == reversesedNumber;
	}

	private static int calculatefactorial(int number) {
		int factorial=1;
		for(int i=1; i<=number; i++) {
			factorial *=i;	
		}
		return factorial;
	}

}
