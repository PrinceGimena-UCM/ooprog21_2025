import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        final double RATE = 0.03; // 3% fixed interest
        int year = 1;
        int choice;

        System.out.println();
        System.out.print("Do you want to see next year's balance?\n");
        System.out.print("Enter 1 for yes or any other number for no >> ");
        choice = input.nextInt();

        while (choice == 1) {
            balance = balance + (balance * RATE);

            System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n%n",
                    year, RATE, balance);

            year++;

            System.out.print("Do you want to see the balance at the end of another year?\n");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
        }
        input.close();
    }
}

