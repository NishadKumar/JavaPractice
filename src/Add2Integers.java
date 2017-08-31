import java.util.Scanner;


public class Add2Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a = sc.nextInt();
		
		System.out.print("Enter the second number:");
		int b = sc.nextInt();
		int result = add(a,b);
		System.out.println("Adding 2 numbers without using arithmetic operators: ");
		System.out.println(result);
		sc.close();
	}
	
	public static int add(int a,int b){
		 if (b == 0)
		        return a;
		    else
		        return add( a ^ b, (a & b) << 1);
		}
}
