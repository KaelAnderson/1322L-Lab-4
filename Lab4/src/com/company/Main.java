package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean cont = true;
        Checking checking = new Checking();
        Savings savings = new Savings();

        do {
            System.out.println("1. Withdraw from Checking\n" +
                    "2. Withdraw from Savings\n" +
                    "3. Deposit to Checking\n" +
                    "4. Deposit to Savings\n" +
                    "5. Balance of Checking\n" +
                    "6. Balance of Savings\n" +
                    "7. Award Interest to Savings now\n" +
                    "8. Quit");
            String input = scan.next();

            switch (input) {
                case "1":
                    System.out.println("How much would you like to withdraw from Checking?");
                    checking.Withdrawal(scan.nextFloat());
                    break;
                case "2":
                    System.out.println("How much would you like to withdraw from Savings?");
                    savings.Withdrawal(scan.nextFloat());
                    break;
                case "3":
                    System.out.println("How much would you like to deposit into Checking?");
                    checking.Deposit(scan.nextFloat());
                    System.out.println("Doing default deposit");
                    break;
                case "4":
                    System.out.println("How much would you like to deposit into Savings?");
                    savings.Deposit(scan.nextFloat());
                    System.out.println("Doing default deposit");
                    break;
                case "5":
                    System.out.println("Your balance for checking " + checking.Getaccountnum() + " is " + checking.Getaccountbal());
                    break;
                case "6":
                    System.out.println("Your balance for savings " + savings.Getaccountnum() + " is " + savings.Getaccountbal());
                    break;
                case "7":
                    savings.interest();
                    break;
                case "8":
                    cont = false;
                    break;
            }
        } while (cont);
    }
}
