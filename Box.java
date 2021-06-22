//Exp 15
import java.util.*;

public class Box {
	int width;
	int height;
	int depth;
	
	Box()
	{
		width = 5;
		height = 5;
		depth = 10;
	}
	
	Box(int w, int h, int d)
	{
		width = w;
		height = h;
		depth = d;
	}

	void printVolume()
	{
		int volume = width*height*depth;
		System.out.println ("The volume is : " + volume);
	}
	public static void main(String[] args) {
		Box vol = new Box();
		vol.printVolume();
		
		System.out.println("The volume calculted from the user input");
		Box vol1 = new Box(5,5,5);
		vol1.printVolume();
		
		Scanner wid = new Scanner(System.in);
		System.out.println ("Enter the width : ");
		int wd = wid.nextInt();
		
		System.out.println ("Enter the height : ");
		int ht = wid.nextInt();
		
		System.out.println ("Enter the depth : ");
		int dp = wid.nextInt();
		
		System.out.println("The width, height and depth given by the user are :" + wd + "\t" + ht + "\t" + dp );
		Box vol2 = new Box(wd,ht,dp);
		vol2.printVolume();
		
	}

}
