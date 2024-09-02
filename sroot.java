
// find the square root of given number
import java.util.*;

public class sroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double number, squareroot;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find the square :");
		number=sc.nextDouble();
		squareroot=Math.sqrt(number);
		System.out.println("Square Root Is :"+squareroot);
		}

}
