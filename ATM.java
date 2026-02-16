import java.util.Scanner;

public class ATMApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        int choice, amount;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    amount = sc.nextInt();
                    balance += amount;
                    System.out.println("Amount deposited successfully.");
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    amount = sc.nextInt();
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Please collect your cash.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}
