package org.example.chapter1;

public class ChildrensPrice extends Price {
    @Override
    double getCharge(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3 ) {
            thisAmount += (daysRented - 3) * 1.5;
        }
        return thisAmount;
    }

    @Override
    int getPriceCode() {
        return 2;
    }


}
