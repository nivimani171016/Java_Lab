
public class _8_SortAA_ {

	public static void main(String[] args) {
		String AA[]= {"Alanine","Valine","Lysine","Isoleucine","Leucine","Methionine","Phenylalanine","Cysteine","Proline","Serine","Threonine","Tryptophan","Histidine","Asparagine","Aspartic Acid","Glutamine","Glutamic Acid","Arginine","Tyrosine","Glycine"};
		String a = Arrays.toString(AA);
		System.out.println("The Amino acids are sorted alphabetically as follows :");
		Arrays.sort(AA);
		for (int i=0;i<20;i++)
		{
			System.out.println(AA[i]);	
		}	
	}
}
