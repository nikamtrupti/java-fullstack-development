
// find out  minimun and maximum of given array
import java.util.*;

public class min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the elements of the array :");
        for(int i=0; i<size; i++) {
        	array[i]=sc.nextInt();
        }
	     int min=array[0];
	     int max=array[0];
	     for(int i=1; i<size; i++) {
	    	 if(array[i]<min) {
	    		 min=array[i];
	    	 }
	    	 if(array[i]>max) {
	    		 max=array[i];
	    		 
	    	 }
	     }
	     System.out.println("Minimun Elements :"+min);
	     System.out.println("Maximun Elements :"+max);
	}

}
