import java.util.Scanner;


public class MultiplyWithoutUsingStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a = sc.nextInt();
		
		System.out.print("Enter the second number:");
		int b = sc.nextInt();
		
		int result = multiplyWithoutStarOperator(a, b);
		System.out.println("Multiplying 2 integers without using star operator: ");
		System.out.println(result);
		sc.close();

	}

	
	public static int multiplyWithoutStarOperator(int x, int y){
		if(y == 0)
		     return 0;
		   /* Add x one by one */
		   if(y > 0 )
		     return (x + multiplyWithoutStarOperator(x, y-1));

		return 0;
		  
		}
}
