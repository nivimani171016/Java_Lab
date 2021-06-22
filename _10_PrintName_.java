import java.util.*;
public class _10_PrintName_ {
	String  name;
	
	_10_PrintName_()
	{
		name = "Maniraj";
	}
	void print()
	{
		for (int i=0;i<=10;i++) //N=10
		{
			System.out.println(name);
		}
	}
	
	void print1()
	{
		System.out.println(name);
	}
	public static void main(String[] args) {
		//Creation of the object 
		_10_PrintName_ pn = new _10_PrintName_();
		System.out.println("The method which contains the loop can print the following ");
		pn.print();
		System.out.println("The method can be access within the loop too by the following to print ");
		//Creating an object
		_10_PrintName_ pn1 =  new _10_PrintName_();
		for (int i=0;i<=5;i++)
		{
			pn1.print1();
		}
	}
}
