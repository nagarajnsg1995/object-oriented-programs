package com.bridgelabz;


import java.util.*;

public class StockMain {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Stock stock = new Stock();


    private static Stock stockDetails() {
        System.out.println("Enter the name of stocks");
        stock.setShareName(scanner.next());
        System.out.println("Enter the number of share");
        stock.setNumberOfShares(scanner.nextInt());
        System.out.println("Enter the share price");
        stock.setSharePrice(scanner.nextInt());
        return stock;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to stock Management report");
        System.out.println("Enter number of stocks");
        stock.setNumberOfStocks(scanner.nextInt());
        double totalStockValue;
        for (int i = 0; i < stock.getNumberOfStocks(); i++) {
            System.out.println(stockDetails());
            double valueOfShare = stock.getSharePrice();


            totalStockValue = stock.getNumberOfShares() * stock.getSharePrice();
            System.out.println("Each share Value of  " + stock.getShareName() + " share is  " + valueOfShare);
            System.out.println("Total Stock value of " + stock.getShareName() + " share is  " + totalStockValue);
        }
    }


}

