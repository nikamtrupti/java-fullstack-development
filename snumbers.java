import java.util.Scanner;
public class snumbers {

			public static void swapByReference(Test obj){
				obj.no1=obj.no1+obj.no2;
				obj.no2=obj.no1-obj.no2;
				obj.no1=obj.no1-obj.no2;
			}
			public static void swapByValue(int no1, int no2)
			{
				no1=no1+no2;
				no2=no1-no2;
				no1=no1-no2;
				System.out.println("Swap [no1="+no1+",no2="+no2+"]");
			}
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				
				int no1,no2;
				System.out.println("Enter 1st number :");
				no1=sc.nextInt();
				System.out.println("Enter 2nd number :");
				no2=sc.nextInt();
				System.out.println("\n Swap two numbers with call by Reference :");
				swapByValue(no1,no2);
				System.out.println("Swap two numbers with call by value :");
				Test t=new Test(no1, no2);
				swapByReference(t);
				System.out.println(t);
				
			}
		

	}
       class Test{
    	   int no1, no2;
    	   public Test(int no1, int no2)
    	   {
    		   this.no1=no1;
    		   this.no2=no2;
    		   }
    	   
       public String toString() {
    	   return "Test[no1="+no1+",no2="+no2+"]";
       }
       }
       

