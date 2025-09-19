import java.util.Scanner;

public class DebugThree1 {
    public static void main(String args[]) {
        double check1;
        double check2;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble();  // Corrected to nextDouble()
        
        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble();  // Corrected to nextDouble()

        calcTip(check1);  // Passing check1 as argument
        calcTip(check2);  // Passing check2 as argument
    }

    public static void calcTip(double bill) {  // Added 'bill' parameter
        final double RATE = 0.15;
        double tip;
        tip = bill * RATE;  // Corrected to calculate tip
        System.out.println("The tip should be at least $" + tip);
    }
}
