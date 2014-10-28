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
		
		printMenu();
		
		in.close();
	}

	private static void printMenu() 
	{
		System.out.println(	"a) Social Security Number" + 
							"b) US Phone number" +
							"c) E-mail address" +
							"d) Name on a class roster, assuming one or more middle initials - Last name, First name, MI" +
							"e) Date in MM-DD-YYYY format" +
							"f) House address - Street number, street name, abbreviation for road, street, boulevard or avenue City followed by state followed by zip as it should appear on a letter" +
							"g) Military time, including seconds" +
							"h) US Currency down to the penny (ex: $123,456,789.23)" +
							"i) URL, including http:// (upper and lower case should be accepted)" +
							"j) A password that contains at least 10 characters and includes at least one upper case character, lower case character, digit, punctuation mark, and does not have more than 3 consecutive lower case characters" +
							"k) All words containing an odd number of alphabetic characters, ending in \"ion\"" +
							"q) quit" );
	}

	
	
}
