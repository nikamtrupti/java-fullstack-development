
// calculate area of rectangle and circumference of a circle
import java.util.*;


public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double l,b,r,rectangle = 5,circumference;
		
		// area of rectangle
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle  :");
	     l=sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle :");
		b=sc.nextDouble();
		System.out.println(" Area Of Rectangle is :"+rectangle);
		rectangle=l*b;
		
		// circumference of circle 
		
		System.out.println("Enter the radius of the circle :");
		r=sc.nextDouble();
		circumference=2*Math.PI*r;
		System.out.println("Circumference of Circle is :"+circumference);
		
		
	}

}
