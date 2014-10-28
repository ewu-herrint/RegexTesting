import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Tyler Herrin


public class RegexTesting {

	public static void main(String[] args) 
	{
		Scanner in;
		
		if(args.length >= 1)
		{
			System.out.println(args[0]);
			File input = new File(args[0]);
			try 
			{
				in = new Scanner(input);
			} 
			catch (FileNotFoundException e)
			{
				System.out.println("File not found. Reverting to user input.");
				in = new Scanner(System.in);
			}
		}
		else
			in = new Scanner(System.in);
		
		
		
		in.close();
	}

}
