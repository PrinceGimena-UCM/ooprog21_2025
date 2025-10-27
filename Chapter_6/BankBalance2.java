import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 100.00;
        double interestRate = 0.03;
        int year = 1;
        int userChoice;

        do {
            balance = balance + (balance * interestRate);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n",
                              year, interestRate, balance);
            System.out.println();
            System.out.print("Do you want to see the balance at the end of another year?\n" +
                             "Enter 1 for yes\n" +
                             "or any other number for no >> ");
            userChoice = input.nextInt();
            year++;
        } while (userChoice == 1);
    }
}

