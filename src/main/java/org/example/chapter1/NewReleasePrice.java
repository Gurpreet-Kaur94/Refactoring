package org.example.chapter1;

public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return 1;
    }

    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }
}
