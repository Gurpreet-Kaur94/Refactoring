package org.example.chapter1;

public class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return 0;
    }

    @Override
    double getCharge(int daysRented) {
        double thisAmount = 2;
        if (daysRented > 2 ) {
            thisAmount += (daysRented - 2) * 1.5;
        }
        return thisAmount;
    }
}
