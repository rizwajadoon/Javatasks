package javalabtask;
import java.util.Scanner;
public class q7 {
    private static int balance = 0;
    public static void deposit(int amount) {
        if (amount > 0) {
            int c = balance += amount;
            System.out.println("Amount deposited successfully: " + c);
        } else {
            System.out.println("Invalid Amount !!");
        }
    }
    public static void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            int c = balance -= amount;
            System.out.println("Amount withdrawed successfully !! " );
        } else if (amount > balance) {
            System.out.println("Insufficient Funds !! ");
        } else {
            System.out.println(" Unknown error occurred !! ");
        }
    }
    public static void checkbalance() {
        System.out.println("current balance in your account is : " + balance);
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int predefinedPIN = 1234;
        boolean Authentication = false;
        System.out.println("------------------------ welocme to PIN Verifictaion sytem --------------------- ");
        System.out.println("Enter your 4-digit pin: ");
        for (int i = 1; i <= 3; i++) {
            if (x.hasNextInt()){
                String input = x.next();
                if (input.length() == 4) {
                    int PIN = Integer.parseInt(input);
                    if (predefinedPIN == PIN) {
                        System.out.println("PIN successfully verified !!");
                        Authentication = true;
                        break;
                    } else {
                        
                        System.out.println("Incorrect PIN!!\n"
                                + "Attempts left : " + (3 - i));
                    }
                } else {
                    System.out.println("Invalid PIN! Please enter exactly 4 digits.");
                    System.out.println("Attempts left: " + (3- i));
                }
            } else {
                x.next();
                System.out.println("Invalid PIN! Please enter numbers only.");
                System.out.println("Attempts left: " + (3- i));
            }
        }
        if (!Authentication) {
            System.out.println("Account locked !!");
            return;
        }
        while (true) {
            System.out.println("========================ATM Main Menu=========================");
            System.out.println("1.Deposit ");
            System.out.println("2.Withdraw ");
            System.out.println("3.check Balance ");
            System.out.println("4.Exit Main Menu");
            System.out.println("Enter your choice (1-4) : ");
            int choice = x.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit :");
                    int DepositAmount = x.nextInt();
                    deposit(DepositAmount);
                    break;
                case 2:
                    System.out.println("Enter Amount to withdraw: ");
                    int WithdrawAmount = x.nextInt();
                    withdraw(WithdrawAmount);
                    break;
                case 3:
                    System.out.println("Check Balance :");
                    checkbalance();
                    break;
                case 4:
                    System.out.println("Thanks for using ATM services..... Goodbye !!! ");
                    System.out.println("Existing........ !!!");
                    return;
                default: {
                    System.out.println("Invalid choice entered !");
                }
            }
        }
        }
    }
