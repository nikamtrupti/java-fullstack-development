import java.util.Scanner;
public class swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no1, no2, temp=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		no1=sc.nextInt();
		no2=sc.nextInt();
        
        temp=no2;
        no2=no1;
        no1=temp;
        System.out.println("number before swaping="+no1+"\n number before Wapping"+no2);
		
	}

}
