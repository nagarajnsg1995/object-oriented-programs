package com.bridgelabz;

public class Stock {
    private int numberOfStocks;
    private int numberOfShares;
    private float sharePrice;
    private String shareName;

    public Stock() {
    }

    public int getNumberOfStocks() {
        return numberOfStocks;
    }

    public void setNumberOfStocks(int numberOfStocks) {
        this.numberOfStocks = numberOfStocks;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public float getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(float sharePrice) {
        this.sharePrice = sharePrice;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "numberOfStocks=" + numberOfStocks +
                ", numberOfShares=" + numberOfShares +
                ", sharePrice=" + sharePrice +
                ", shareName='" + shareName + '\'' +
                '}';
    }
}
