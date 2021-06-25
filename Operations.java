package Arithmetic;
import java.util.*;
public class Operations {
	public void add(int a, int b)
	{
		System.out.println (a+b);
	}
	
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	
	public void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	
	public void div(int a, int b)
	{
		System.out.println (a/b);
	}
	
	public void mod(int a, int b)
	{
		System.out.println(a%b);
	}
	
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print ("Enter the value of a :");
		int n1 = n.nextInt();
		Scanner m = new Scanner(System.in);
		System.out.print("Enter the value of b : ");
		int n2 = m.nextInt();
		
		System.out.println("The sum of the given numbers is : ");
		Operations ad = new Operations();
		ad.add(n1,n2);
		
		System.out.println("The difference between the given numbers is : ");
		Operations sub = new Operations();
		sub.sub(n1, n2);
		
		System.out.println("The multiplication of the given numbers is : " );
		Operations mul =  new Operations();
		mul.mul(n1, n2);
		
		System.out.println("The division of the given number gives the quotient as :");
		Operations div = new Operations();
		div.div(n1, n2);
		
		System.out.println("The Modulo divison of the given number gives the remainder as :" );
		Operations mod = new Operations();
		mod.mod(n1, n2);
		
	}

}
