
// find the asci value of the given character 

import java.util.*;
public class asciivalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character :");
		char ch=sc.next().charAt(0);
		int asciiValue=(int )ch;
		System.out.println("The ASCII value of "+ch+"is:"+asciiValue);
		
		
	}

}
