package org.example.chapter1;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;

    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPrice(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPrice(int priceCode) {
        if (priceCode == REGULAR) {
            price = new RegularPrice();
        } else if (priceCode == CHILDRENS) {
            price = new ChildrensPrice();
        } else if (priceCode == NEW_RELEASE) {
            price = new NewReleasePrice();
        }
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        if(getPriceCode() == NEW_RELEASE && daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
