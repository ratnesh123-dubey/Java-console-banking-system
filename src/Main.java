import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService service = new BankService();

        while(true) {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if(choice == 1) {

                System.out.print("Account Number: ");
                int accNo = sc.nextInt();

                System.out.print("Name: ");
                String name = sc.next();

                System.out.print("Initial Balance: ");
                double balance = sc.nextDouble();

                service.createAccount(accNo, name, balance);
            }

            else if(choice == 2) {

                System.out.print("Account Number: ");
                int accNo = sc.nextInt();

                BankAccount acc = service.findAccount(accNo);

                if(acc != null) {
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    acc.deposit(amt);
                }
                else {
                    System.out.println("Account not found.");
                }
            }

            else if(choice == 3) {

                System.out.print("Account Number: ");
                int accNo = sc.nextInt();

                BankAccount acc = service.findAccount(accNo);

                if(acc != null) {
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    acc.withdraw(amt);
                }
                else {
                    System.out.println("Account not found.");
                }
            }

            else if(choice == 4) {

                System.out.print("Account Number: ");
                int accNo = sc.nextInt();

                BankAccount acc = service.findAccount(accNo);

                if(acc != null) {
                    acc.display();
                }
                else {
                    System.out.println("Account not found.");
                }
            }

            else if(choice == 5) {
                System.out.println("Thank you for using bank system.");
                break;
            }
        }
    }
}