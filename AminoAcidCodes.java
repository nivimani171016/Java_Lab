package Codes;
import java.util.*;
public class AminoAcidCodes {
	String AA;
	
	String printCode(String AA)
	{
		String cd = "";
		switch (AA)
		{
		case "F":
			cd = "UUU/UUC";
			break;
		case "L":
			cd = "UUA/UUG/CUU/CUC/CUA/CUG";
			break;
		case "I":
			cd = "AUU/AUC/AUA";
			break;
		case "M":
			cd = "AUG";
			break;
		case "V":
			cd = "GUU/GUC/GUA/GUG";
			break;
		case "S":
			cd = "UCU/UCC/UCA/UCG/AGU/AGC";
			break;
		case "P":
			cd = "CCU/CCA/CCG/CCC";
			break;
		case "T":
			cd = "ACU/ACC/ACG/ACA";
			break;
		case "A":
			cd = "GCU/GCC/GCA/GCG";
			break;
		case "Y":
			cd = "UAU/UAC";
			break;
		case "H":
			cd = "CAU/CAC";
			break;
		case "Q":
			cd = "CAA/CAG";
			break;
		case "N":
			cd = "AAU/AAC";
			break;
		case "K":
			cd = "AAA/AAG";
			break;
		case "D":
			cd = "GAU/GAC";
			break;
		case "E":
			cd = "GAA/GAG";
			break;
		case "C":
			cd = "UGU/UGC";
			break;
		case "W":
			cd = "UGG";
			break;
		case "R":
			cd = "CGU/CGC/CGA/CGG/AGA/AGG";
			break;
		case "G":
			cd ="GGU/GGA/GGC/GGG";
			break;	
		default:
			System.out.println ("Enter the correct code in the Upper case");			
		}
		return cd;
	}

	public static void main(String[] args) {
		Scanner code = new Scanner(System.in);
		System.out.println("Enter the 1 letter AminoAcid code : ");
		String cd = code.nextLine();
		AminoAcidCodes result = new AminoAcidCodes();
		System.out.println("The equivalent 3 letter is Codon : ");
		System.out.println(result.printCode(cd));
	}

}
