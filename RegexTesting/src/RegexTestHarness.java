import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
public class RegexTestHarness {

    @SuppressWarnings({ "resource" })
	public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);//System.console();
        if (kb == null) 
        {
            System.err.println("No console.");
            System.exit(1);
        }
        while (true) 
        {
            System.out.print("Enter your regex: ");
            Pattern pattern = 
            Pattern.compile(kb.nextLine());
            System.out.print("Enter input string to search: ");
            Matcher matcher = 
            pattern.matcher(kb.nextLine());

            boolean found = false;
            while (matcher.find()) {
                System.out.printf("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found)
            {
                System.out.println("No match found.");
            }
        }
    }
}