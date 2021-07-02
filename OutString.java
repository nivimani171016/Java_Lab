import java.io.*;
public class OutString {
public static void main(String[]args) {
	try {
	FileOutputStream os = new FileOutputStream("OutString.txt");
	String in = "This is the first input string file";
	byte[] ip = in.getBytes();
	os.write(ip);
	os.close();
	System.out.println("The string is added successfully");
	}catch(Exception e){
	System.out.println(e);
	}
	}
	}