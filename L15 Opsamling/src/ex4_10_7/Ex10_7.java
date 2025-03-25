package ex4_10_7;

import java.util.Scanner;

public class Ex10_7 {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            while (id < 0 || id > 9) {
                System.out.print("Enter correct id: ");
                id = scanner.nextInt();
                scanner.nextLine();
            }
            System.out.println();

            int choice = 0;
            while (choice != 4) {
                displayMenu();
                System.out.print("Enter a choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.printf("--> The balance is $%.2f\n", accounts[id].getBalance());
                } else if (choice == 2) {
                    System.out.print("Enter an mount to withdraw: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    accounts[id].withDraw(amount);
                    System.out.printf("--> $%.2f is withdrawn from account %d\n", amount, id);
                } else if (choice == 3) {
                    System.out.print("Enter an mount to deposit: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    accounts[id].deposit(amount);
                    System.out.printf("--> $%.2f is deposited to account %d\n", amount, id);
                } else if (choice == 4) {
                    System.out.println("Exiting");
                } else {
                    System.out.println("Unknown choice");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void displayMenu() {
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }
}
