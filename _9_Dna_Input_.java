import java.util.*;
public class _9_Dna_Input_ {

	public static void main(String[] args) {
	Scanner dna=new Scanner(System.in);
	System.out.println("Enter the Dna sequence : ");
	String seq=dna.nextLine();
	System.out.println("The DNA Sequence is : ");
	System.out.println(seq);
	int len = seq.length();
	System.out.println("The length of the DNA sequence is " + len);
	}

}
