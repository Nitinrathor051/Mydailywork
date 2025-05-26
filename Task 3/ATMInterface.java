import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 5000; // Initial balance

        while (true) {
            System.out.println("Welcome to the ATM.");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Your balance is: " + balance);
            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.println("Successfully deposited: " + depositAmount);
                } else {
                    System.out.println("Invalid deposit amount.");
                }
            } else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                if (withdrawAmount > 0 && withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    System.out.println("Successfully withdrew: " + withdrawAmount);
                } else {
                    System.out.println("Insufficient balance or invalid amount.");
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                scanner.close();
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
