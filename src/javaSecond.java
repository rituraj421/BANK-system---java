import java.util.Scanner;

public class javaSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        double[] accountBalances = new double[250];
        String[] accountNames = new String[250];
        for (; true;) {
            System.out.println("Bank Admin Menu");
            System.out.println("Please Enter a Menu Option");
            System.out.println("(1): Add Customer to Bank");
            System.out.println("(2): Change Customer Name");
            System.out.println("(3): Check Account balance");
            System.out.println("(4): Modify Account balance");
            System.out.println("(5): Summary of All Accounts");
            System.out.println("(-1): Quit");

            int userInput = sc.nextInt();
            if (userInput == 1) {
                System.out.println("Bank Add Customer Menu");
                System.out.println("Please Enter an account balance");
                double balance = sc.nextDouble();
                accountBalances[size] = balance;
                System.out.println("Please enter an account holder name: ");
                sc.nextLine();
                String name = sc.nextLine();
                accountNames[size] = name;
                System.out.println("Customer's ID is :" + size);
                size = size + 1;
            } else if (userInput == 2) {
                System.out.println("Bank Change Name Menu");
                System.out.println("Please Enter a customer ID to change their name");
                int index = sc.nextInt();
                System.out.println("What is the customer's new name?");
                sc.nextLine();
                accountNames[index] = sc.nextLine();
            } else if (userInput == 3) {
                System.out.println("Bank Check balance Menu");
                System.out.println("Please Enter a customer ID to check their balance");
                int index = sc.nextInt();
                double balance = accountBalances[index];
                System.out.println("This customer has $" + balance + " in their account");
            } else if (userInput == 4) {
                System.out.println("Bank Modify balance Menu");
                System.out.println("Please Enter a customer ID to check their balance");
                int index = sc.nextInt();
                System.out.println("What is the customer's new account balance");
                accountBalances[index] = sc.nextDouble();
            } else if (userInput == 5) {
                System.out.println("Bank All Customer Summary Menu");
                double total = 0;
                for (int i = 0; i < size; i++) {
                    total = total + accountBalances[i];
                    System.out.println(accountNames[i] + " has $" + accountBalances[i] + " in their account");
                }
                System.out.println("In total, there is $" + total + " in the bank");
            } else if (userInput == -1) {

            } else {

            }
        }
    }

}
