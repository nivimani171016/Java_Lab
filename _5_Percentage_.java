
public class _5_Percentage_ {

	public static void main(String[] args) {
		int lang = 85;
		int eng = 96;
		int mat = 75;
		int sci = 65;
		int ssci = 98;
		float sum = (lang+eng+mat+sci+ssci);
		float percentage = ((sum)/500)*100;
		System.out.println("The percentage of the marks scored by the student is : "+ percentage + "%");
		if (percentage>50)
		{
			System.out.println("The Student passed");
		}
		else
		{
			System.out.println("The Student failed");
		}

	}

}
