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
		
		String choice = in.nextLine();
		
		menuChoice(choice, in);
		
		in.close();
	}

	private static void menuChoice(String choice, Scanner in) 
	{
		switch(choice)
		{
			case "a":
				socialSecurityCheck(in);
				break;
			case "b":
				phoneNumberCheck(in);
				break;
			case "c":
				emailCheck(in);
				break;
			case "d":
				nameCheck(in);
				break;
			case "e":
				dateCheck(in);
				break;
			case "f":
				addressCheck(in);
				break;
			case "g":
				cityCheck(in);
				break;
			case "h":
				timeCheck(in);
				break;
			case "i":
				currencyCheck(in);
				break;
			case "j":
				urlCheck(in);
				break;
			case "k":
				passwordCheck(in);
				break;
			case "l":
				alphaOddIonCheck(in);
				break;
			case "q":
				// Quit program.
				break;
		}
	}

	private static void alphaOddIonCheck(Scanner in) {
		// TODO Auto-generated method stub
		
	}

	private static void passwordCheck(Scanner in) {
		// TODO Auto-generated method stub
		
	}

	private static void urlCheck(Scanner in) {
		// TODO Auto-generated method stub
		
	}

	private static void currencyCheck(Scanner in) {
		// TODO Auto-generated method stub
		
	}

	private static void timeCheck(Scanner in) {
		// TODO Auto-generated method stub
		
	}

	private static void dateCheck(Scanner in) {
		// TODO Auto-generated method stub
		
	}

	private static void cityCheck(Scanner in) {
		// TODO Auto-generated method stub
		
	}

	private static void addressCheck(Scanner in) {
		// TODO Auto-generated method stub
		
	}

	private static void nameCheck(Scanner in) {
		// TODO Auto-generated method stub
		
	}

	private static void emailCheck(Scanner in) {
		// TODO Auto-generated method stub
		
	}

	private static void phoneNumberCheck(Scanner in) {
		// TODO Auto-generated method stub
		
	}

	private static void socialSecurityCheck(Scanner in) {
		// TODO Auto-generated method stub
		
	}

	private static void printMenu() 
	{
		System.out.println(	"a) Social Security Number \n" + 
							"b) US Phone number \n" +
							"c) E-mail address \n" +
							"d) Name on a class roster, assuming one or more middle initials - Last name, First name, MI \n" +
							"e) Date in MM-DD-YYYY format \n" +
							"f) House address - Street number, street name, abbreviation for road, street, boulevard or avenue \n" +
							"g) City followed by state followed by zip as it should appear on a letter \n" +
							"h) Military time, including seconds\n" +
							"i) US Currency down to the penny (ex: $123,456,789.23) \n" +
							"j) URL, including http:// (upper and lower case should be accepted) \n" +
							"k) A password that contains at least 10 characters and includes at least one upper case character, lower case character, digit, punctuation mark, and does not have more than 3 consecutive lower case characters \n" +
							"l) All words containing an odd number of alphabetic characters, ending in \"ion\" \n" +
							"q) quit \n" );
	}

	
	
}
