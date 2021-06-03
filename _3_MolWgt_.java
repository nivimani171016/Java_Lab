
public class _3_MolWgt_ {

	public static void main(String[] args) {
		String AA[]= {"Alanine","Valine","Lysine","Isoleucine","Leucine","Methionine","Phenylalanine","Cysteine","Proline","Serine","Threonine","Tryptophan","Histidine","Asparagine","Aspartic Acid","Glutamine","Glutamic Acid","Arginine","Tyrosine","Glycine"};
		int a = AA.length;
		double MolWgt[]= {89.1,117.1,146.2,131.2,131.2,149.2,165.2,121.2,115.1,105.1,119.1,204.2,155.2,132.1,133.1,146.2,147.1,174.2,181.2,75.1};
		int b = MolWgt.length;
		
		for (int i=0;i<a;i++)
		{
				System.out.println(AA[i] + "\t\t" + MolWgt[i]);	
			
		}
		System.out.println("No of AminoAcids : " + a);
			
	}

}
