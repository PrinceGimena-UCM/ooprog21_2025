// Application lists valid shipping codes
// A, C, T, or H
// then prompts user for a code
// Application accepts a shipping code
// and determines if it is valid
import java.util.*;
public class DebugEight1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        char userCode;
        String entry;

        boolean found = false;     // was true before, but it should start as false

        char[] okayCodes = {'A','C','T','H'};
        System.out.println("Enter shipping code for this delivery.");
        System.out.print("Valid codes are: ");

        for(int x = 0; x < okayCodes.length; ++x)   // fixed: loop should show all valid codes
        {
            System.out.print(okayCodes[x]);
            if(x != (okayCodes.length - 1))
                System.out.print(", ");
        }

        System.out.print(" >> ");
        entry = input.nextLine();

        userCode = entry.charAt(0);    // fixed: should read the first character only

        for(int i = 0; i < okayCodes.length; ++i)
        {
            if(userCode == okayCodes[i])   // fixed: used == to compare characters
            {
                found = true;
            }
        }

        if(found)       // fixed: corrected the output so it matches the result
            System.out.println("Good code");
        else
            System.out.println("Sorry code not found");
    }
}
