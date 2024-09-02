// calculate simple interest and compound interest 

import java.util.Scanner;

public class compound_simplei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float p,r,t,si, amount,n,ci;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount");
		amount=sc.nextFloat();
		System.out.println("enter principle amount :");
		p=sc.nextFloat();
		System.out.println("enter rate of intrest :");
		r=sc.nextFloat();
		System.out.println("enter duration on time :");
		t=sc.nextFloat();
		System.out.println("enter number of times interest is compound :");
		n=sc.nextFloat();
		si=p*r*t/100;
		System.out.println("Simple intrest is :"+si);
		ci=p*(1+r/n)*t;
		System.out.println("Compound interest is:"+ci);

		
		
	}

}
