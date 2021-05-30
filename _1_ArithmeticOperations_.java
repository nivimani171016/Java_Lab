
public class _1_ArithmeticOperations_ {

	public static void main(String[] args) {
		int a = 2;
		int b = 8;
		
		//Method 1
		//Addition 
		System.out.print("The sum of the given numbers is : ");
		int c = a+b;
		System.out.println(c);
		//Subtraction
		System.out.print("The difference between the given numbers is : ");
		int d = b-a;
		System.out.println(d);
		//Multiplication 
		System.out.print("The multiplication of the given numbers is : ");
		int e =a+b;
		System.out.println(e);
		//Division 
		System.out.print("The division of the given number gives the quotient as :");
		int f = b/a;
		System.out.println(f);
		//Modulo Division 
		System.out.print("The Modulo divison of the given number gives the remainder as :");
		int g = b%a;
		System.out.println(g);
		
		//Method 2
		System.out.println("The sum of the given numbers is : " + (a+b));//Addition 
		System.out.println("The difference between the given numbers is : " + (b-a));//Subtraction
		System.out.println("The multiplication of the given numbers is : " + (a*b));//Multiplication
		System.out.println("The division of the given number gives the quotient as :" + (b/a));//Division
		System.out.println("The Modulo divison of the given number gives the remainder as :" + (b%a));//Modulo division
		
		}

}
