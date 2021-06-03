public class _7_ArrayAverage_ {

	public static void main(String[] args) {
		double num[]= {56.2,59.6,89.5,78.5,69.4,56.8,96.7,86.45,68.69,79.65};
		double avg=0.0;
		double j=0.0;
		for (int i=0;i<10;i++)
		{
			j=j+num[i];
		}
		System.out.print("The average of the given numbers is : ");
		
		avg = j/10 ;
		
		System.out.println(avg);
	
	}

}
