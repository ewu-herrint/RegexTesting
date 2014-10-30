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
		
		String choice;
		do
		{
			choice = in.nextLine();
			choice = menuChoice(choice, in);
		}while(!choice.matches("q"));
			
		
		in.close();
	}

	private static String menuChoice(String choice, Scanner in) 
	{
		switch(choice)
		{
			case "a":
				socialSecurityCheck(in);
				return "z";
			case "b":
				phoneNumberCheck(in);
				return "z";
			case "c":
				emailCheck(in);
				return "z";
			case "d":
				nameCheck(in);
				return "z";
			case "e":
				dateCheck(in);
				return "z";
			case "f":
				addressCheck(in);
				return "z";
			case "g":
				cityCheck(in);
				return "z";
			case "h":
				timeCheck(in);
				return "z";
			case "i":
				currencyCheck(in);
				return "z";
			case "j":
				urlCheck(in);
				return "z";
			case "k":
				passwordCheck(in);
				return "z";
			case "l":
				alphaOddIonCheck(in);
				return "z";
			case "q":
				// Quit program.
				return "q";
		}
		return "q";
	}

	private static void alphaOddIonCheck(Scanner in) 
	{
		String input = in.nextLine();
		if(!(input.length() % 2 == 0))
		{
			if(input.matches("^[a-zA-Z]*ion$"))
			{
				System.out.println("Valid odd ion word.");
			}
			else
			{
				System.out.println("Invalid odd ion word.");
			}
		}
		else
		{
			System.out.println("Invalid odd ion word.");
		}
	}

	private static void passwordCheck(Scanner in) 
	{
		// TODO Auto-generated method stub
	}

	private static void urlCheck(Scanner in) 
	{
		// TODO Auto-generated method stub
		
	}

	private static void currencyCheck(Scanner in) 
	{
		// TODO Auto-generated method stub
		
	}

	private static void timeCheck(Scanner in) 
	{
		// TODO Auto-generated method stub
		
	}

	private static void dateCheck(Scanner in) 
	{
		String input = in.nextLine();
		if(input.matches("^(0[1-9]|1[012])([-/])(0[1-9]|[12][0-9]|3[01])\\2(19|20)\\d\\d"))
		{
			System.out.println("Valid Date.");
		}
		else
		{
			System.out.println("Invalid Date.");
		}
		
	}

	private static void cityCheck(Scanner in) 
	{
		// TODO Auto-generated method stub
		
	}

	private static void addressCheck(Scanner in) 
	{
		// TODO Auto-generated method stub
		// Need to implement ability to do "1st St" etc.
		String input = in.nextLine();
		if(input.matches("^[0-9]{1, 5}, [A-Z][a-z]+ ((St.|Rd.|Ave.|Blvd.)|(Street|Road|Avenue|Boulevard))$"))
		{
			System.out.println("Valid Name.");
		}
		else
		{
			System.out.println("Invalid Name.");
		}
	}

	private static void nameCheck(Scanner in) 
	{
		String input = in.nextLine();
		if(input.matches("^[A-Z][a-z]+,\\s*[A-Z][a-z]+,*\\s*[A-Z]*$"))
		{
			System.out.println("Valid Name.");
		}
		else
		{
			System.out.println("Invalid Name.");
		}
	}

	private static void emailCheck(Scanner in) 
	{
		// TODO Auto-generated method stub
		
	}

	private static void phoneNumberCheck(Scanner in) 
	{
		String input = in.nextLine();
		if(input.matches("^(\\([0-9]{3}\\)|^[0-9]{3}) ([0-9]{3}-[0-9]{4}$|[0-9]{3} [0-9]{4})$"))
		{
			System.out.println("Valid US Phone Number.");
		}
		else
		{
			System.out.println("Invalid US Phone Number.");
		}
	}

	private static void socialSecurityCheck(Scanner in)
	{
		String input = in.nextLine();
		if(input.matches("^[0-9]{3}-[0-9]{2}-[0-9]{4}$") 
						|| input.matches("^[0-9]{3} [0-9]{2} [0-9]{4}$") 
						|| input.matches("^[0-9]{9}$"))
		{
			System.out.println("Valid Social Security Number.");
		}
		else
		{
			System.out.println("Invalid Social Security Number.");
		}
		
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
