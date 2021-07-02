import java.io.*;
public class OutStream {
public static void main(String[]arg){
	try {
	FileOutputStream os = new FileOutputStream("IntToString.txt");
	os.write(115);
	os.close();
	System.out.println ("The int is added to the file in char data type");
	}catch(Exception e){
	System.out.println(e);
	}
	}
}