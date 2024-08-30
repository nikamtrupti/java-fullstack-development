import java.util.Scanner;

public class character {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char option;
	
		Scanner sc=new Scanner(System.in);
      
		 System.out.println("Enter The Value :");
		option=sc.next().charAt(0);
        if(option>='0' && option <='9') {
        System.out.println("It Is A Digtit...");
        }
        else if(option>='A' && option <='z')
        
        {
        System.out.println("It Is Alphabets... ");	
		
	}
        else
        {
        	System.out.println("It Is An Symbol...");
        }

}
}
