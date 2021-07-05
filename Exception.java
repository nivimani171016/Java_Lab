
public class Exception {

	public static void main(String[] args) {
		try {
			int a = 67/0;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("The Arithmetic exception handling is demonstrated");
	}

}
