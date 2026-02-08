package main;

import service.BankSystem;

import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankSystem bankSystem = new BankSystem();

        while (true) {
            System.out.println("\n--- Banking Information System ---");
            System.out.println("1. Register User");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Set Password: ");
                    String password = sc.nextLine();

                    System.out.print("Initial Deposit: ");
                    double deposit = sc.nextDouble();

                    bankSystem.registerUser(name, address, phone, password, deposit);
                    break;

                case 2:
                    System.out.println("Thank you for using the Banking System!");
                    return;

                default:
                    System.out.println("❌ Invalid choice");
            }
        }
    }
}
