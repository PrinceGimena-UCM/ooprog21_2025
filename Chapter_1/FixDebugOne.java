public class FixDebugOne   
{
    /* This program displays a greeting */
    public static void main(String[] args)   
    {
        System.out.println("Hello World!");  
    }
}
/* 
 BUG 1: The class name originally had a space. Java class names can’t have spaces.
 BUG 2: The word "Main" was capitalized. It should be lowercase "main".
 BUG 3: parameter should be String[] args, not String args
 BUG 4: "System" was misspelled as "Systm".
 BUG 5: Missing semicolon at the end
 */