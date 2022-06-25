package com.bridgelabz;

import java.util.*;
public class AccountManagement {

    public static void main(String[] args) {
        AccountDetails accountDetails = new AccountDetails();
        System.out.println("available Account balance is: " + accountDetails.getBalance());
        AccountManagement account = new AccountManagement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the debit amount");
        int debit = scanner.nextInt();
        account.debit(debit);
        System.out.println("enter credit amount");
        int credit = scanner.nextInt();
        account.credit(credit);
    }
    public void debit(double debit) {
        AccountDetails accountdetails = new AccountDetails();
        if (accountdetails.getBalance() >= debit) {
            double remainingBalance = accountdetails.getBalance() - debit;

            accountdetails.setBalance(remainingBalance);
            System.out.println("remaining Account balance is :" + accountdetails.getBalance());
        } else {
            System.out.println("Debit amount exceed account balance");
        }
    }
    public void credit(double creditAmount) {
        AccountDetails accountdetails = new AccountDetails();
        double remainingBalance2 = accountdetails.getBalance() + creditAmount;
        accountdetails.setBalance(remainingBalance2);
        System.out.println("remaining Account balance is :" + remainingBalance2);
    }
}
