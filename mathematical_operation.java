import java.util.Scanner;


public class mathematical_operation {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  opertion, add,sub,div,mul,sum;
		int no1,no2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No 1 :");
		no1=sc.nextInt();
		
		System.out.println("Enter No 2 :");
		no2=sc.nextInt();
		System.out.println("1. Addition\n 2. Subtraction\n 3.Multiplication\n 4.Division");
		System.out.println("Enter Choice for Operation :");
		opertion=sc.nextInt();
		add=no1+no2;
		sub=no1-no2;
		mul=no1*no2;
		div=no1/no2;
		switch (opertion) {
		case 1:
			System.out.println("Addition of Number Is :"+add);
			break;
		case 2:	
			System.out.println("Subtraction of Number Is :"+sub);
			break;
		case 3:
			System.out.println("Multiplication  of Number Is :"+mul);
			break;
		case 4:
			System.out.println("Division  of Number Is :"+div);
			break;
		default:
			System.out.println("Operation is Not Valid");
			
		}
		
			
	}




	}


